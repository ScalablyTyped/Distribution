package typings.arcgisJsApi.fieldsContentMod

import typings.arcgisJsApi.esri.FieldsContent
import typings.arcgisJsApi.esri.FieldsContentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/popup/content/FieldsContent", JSImport.Namespace)
@js.native
/**
  * A `FieldsContent` popup element represents the [FieldInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html) associated with a feature. If this is not set within the content, it will revert to whatever may be set within the [PopupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html)
  */
class Class () extends FieldsContent {
  def this(properties: FieldsContentProperties) = this()
}

