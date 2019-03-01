package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsProperties extends ContentElementContentElementProperties {
  /**
    * Object array of [fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-FieldInfo.html). If the `fieldInfos` property is not provided directly within the content, the popup will display whatever is set in the [PopupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Fields.html#fieldInfos)
    */
  var fieldInfos: js.UndefOr[js.Array[FieldInfoProperties]] = js.undefined
}

object FieldsProperties {
  @scala.inline
  def apply(fieldInfos: js.Array[FieldInfoProperties] = null): FieldsProperties = {
    val __obj = js.Dynamic.literal()
    if (fieldInfos != null) __obj.updateDynamic("fieldInfos")(fieldInfos)
    __obj.asInstanceOf[FieldsProperties]
  }
}

