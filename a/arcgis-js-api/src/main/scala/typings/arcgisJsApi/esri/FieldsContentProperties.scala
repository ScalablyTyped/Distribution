package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldsContentProperties extends ContentProperties {
  /**
    * Array of [fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html). If the `fieldInfos` property is not provided directly within the content, the popup will display whatever is set in the [PopupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html#fieldInfos)
    */
  var fieldInfos: js.UndefOr[js.Array[FieldInfoProperties]] = js.undefined
}

object FieldsContentProperties {
  @scala.inline
  def apply(fieldInfos: js.Array[FieldInfoProperties] = null): FieldsContentProperties = {
    val __obj = js.Dynamic.literal()
    if (fieldInfos != null) __obj.updateDynamic("fieldInfos")(fieldInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldsContentProperties]
  }
}

