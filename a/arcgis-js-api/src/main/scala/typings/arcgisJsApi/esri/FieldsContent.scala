package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.fields
import typings.arcgisJsApi.esri.content.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldsContent
  extends StObject
     with Content_
     with Content
     with contentContent {
  
  /**
    * Describes the field's content in detail.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html#description)
    */
  var description: String = js.native
  
  /**
    * Array of [fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-FieldInfo.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html#fieldInfos)
    */
  var fieldInfos: js.Array[FieldInfo] = js.native
  
  /**
    * Heading indicating what the field's content represents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html#title)
    */
  var title: String = js.native
  
  /**
    * The type of popup element displayed.
    *
    * @default fields
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-FieldsContent.html#type)
    */
  @JSName("type")
  val type_FieldsContent: fields = js.native
}
