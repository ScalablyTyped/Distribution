package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.fields
import typings.arcgisJsApi.esri.content.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldsContent
  extends Content_
     with Content
     with contentContent {
  /**
    * Array of [fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html). If the `fieldInfos` property is not provided directly within the content, the popup will display whatever is set in the [PopupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html#fieldInfos)
    */
  var fieldInfos: js.Array[FieldInfo] = js.native
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html#type)
    *
    * @default fields
    */
  @JSName("type")
  val type_FieldsContent: fields = js.native
}

@JSGlobal("__esri.FieldsContent")
@js.native
object FieldsContent extends TopLevel[FieldsContentConstructor]

