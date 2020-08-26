package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A convenience module for importing [Content](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-Content.html) classes when developing with [TypeScript](https://developers.arcgis.com/javascript/latest/guide/typescript-setup/index.html). For example, rather than importing content elements one at a time like this:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content.html)
  */
@JSGlobal("__esri.content")
@js.native
object content extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.arcgisJsApi.esri.TextContent
    - typings.arcgisJsApi.esri.MediaContent
    - typings.arcgisJsApi.esri.FieldsContent
    - typings.arcgisJsApi.esri.AttachmentsContent
    - typings.arcgisJsApi.esri.CustomContent
  */
  trait Content extends js.Object
  
  type AttachmentsContent = typings.arcgisJsApi.esri.AttachmentsContent
  type CustomContent = typings.arcgisJsApi.esri.CustomContent
  type FieldsContent = typings.arcgisJsApi.esri.FieldsContent
  type MediaContent = typings.arcgisJsApi.esri.MediaContent
  type TextContent = typings.arcgisJsApi.esri.TextContent
}

