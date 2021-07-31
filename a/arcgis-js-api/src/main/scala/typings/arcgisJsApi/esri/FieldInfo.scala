package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`rich-text`
import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import typings.arcgisJsApi.arcgisJsApiStrings.`text-box`
import typings.arcgisJsApi.arcgisJsApiStrings.`var`
import typings.arcgisJsApi.arcgisJsApiStrings.avg
import typings.arcgisJsApi.arcgisJsApiStrings.count
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.stddev
import typings.arcgisJsApi.arcgisJsApiStrings.sum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The field name as defined by  the service or the `name` of an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#fieldName)
    */
  var fieldName: String = js.native
  
  /**
    * Class which provides formatting options for numerical or date fields and how they should display within a popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#format)
    */
  var format: FieldInfoFormat = js.native
  
  /**
    * A Boolean determining whether users can edit this field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#isEditable)
    */
  var isEditable: Boolean = js.native
  
  /**
    * A string containing the field alias.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#label)
    */
  var label: String = js.native
  
  /**
    * Used in a `one:many` or `many:many` relationship to compute the statistics on the field to show in the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#statisticType)
    */
  var statisticType: count | sum | min | max | avg | stddev | `var` = js.native
  
  /**
    * A string determining what type of input box editors see when editing the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#stringFieldOption)
    */
  var stringFieldOption: `rich-text` | `text-area` | `text-box` = js.native
  
  /**
    * A string providing an editing hint for editors of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#tooltip)
    */
  var tooltip: String = js.native
  
  /**
    * Indicates whether the field is visible in the popup window.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html#visible)
    */
  var visible: Boolean = js.native
}
