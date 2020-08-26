package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.custom
import typings.arcgisJsApi.esri.content.Content
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomContent
  extends Content_
     with Content
     with contentContent {
  /**
    * The function that is called to create the custom content element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#creator)
    */
  @JSName("creator")
  var creator_Original: PopupTemplateContentCreator = js.native
  /**
    * The called function to cleanup custom content when it is no longer necessary.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#destroyer)
    */
  @JSName("destroyer")
  var destroyer_Original: PopupTemplateContentDestroyer = js.native
  /**
    * An array of field names used in the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). Use this property to indicate what fields are required to fully render the PopupTemplate. This is important if setting [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#content) via a function since any fields needed for successful rendering should be specified here.  To fetch the values from all fields, use `["*"]`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#outFields)
    */
  var outFields: js.Array[String] = js.native
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#type)
    *
    * @default custom
    */
  @JSName("type")
  val type_CustomContent: custom = js.native
  /**
    * The function that is called to create the custom content element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#creator)
    */
  def creator(graphic: Graphic): String | HTMLElement | Widget_ | js.Promise[_] = js.native
  /**
    * The called function to cleanup custom content when it is no longer necessary.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#destroyer)
    */
  def destroyer(graphic: Graphic): Unit = js.native
}

