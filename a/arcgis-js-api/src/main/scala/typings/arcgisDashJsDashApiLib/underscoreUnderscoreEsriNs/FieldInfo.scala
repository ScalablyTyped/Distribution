package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldInfo
  extends Accessor
     with JSONSupport {
  /**
    * The field name as defined by  the service or the `name` of an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression. Arcade expression names are defined in the [expressionInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html#expressionInfos) property. When referencing Arcade expressions, you must preface the name with `expression/`, such as `expression/percent-total`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html#fieldName)
    */
  var fieldName: java.lang.String = js.native
  /**
    * Class which provides formatting options for numerical or date fields and how they should display within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html#format)
    */
  var format: FieldInfoFormat = js.native
  /**
    * A Boolean determining whether users can edit this field. This is not applicable to Arcade expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html#isEditable)
    *
    * @default false
    */
  var isEditable: scala.Boolean = js.native
  /**
    * A string containing the field alias. Not applicable to Arcade expressions as the title is used instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html#label)
    */
  var label: java.lang.String = js.native
  /**
    * Used in a `one:many` or `many:many` relationship to compute the statistics on the field to show in the popup. If the property is present, must be one of the following values:  **Possible Values:** count | sum | min | max | avg | stddev | var
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html#statisticType)
    */
  var statisticType: java.lang.String = js.native
  /**
    * A string determining what type of input box editors see when editing the field. Applies only to string fields. This is not applicable to Arcade expressions. If this property is present, it must be one of the following values:  **Possible Values:** rich-text | text-area | text-box
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html#stringFieldOption)
    *
    * @default text-box
    */
  var stringFieldOption: java.lang.String = js.native
  /**
    * A string providing an editing hint for editors of the field. This is not applicable to Arcade expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html#tooltip)
    */
  var tooltip: java.lang.String = js.native
  /**
    * Indicates whether the field is visible in the popup window.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html#visible)
    *
    * @default true
    */
  var visible: scala.Boolean = js.native
}

