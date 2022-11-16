package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.attachments
import typings.arcgisJsApi.arcgisJsApiStrings.custom_
import typings.arcgisJsApi.arcgisJsApiStrings.expression
import typings.arcgisJsApi.arcgisJsApiStrings.fields
import typings.arcgisJsApi.arcgisJsApiStrings.media
import typings.arcgisJsApi.arcgisJsApiStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Content_
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-Content.html#type)
    */
  val `type`: text | fields | media | attachments | custom_ | expression | typings.arcgisJsApi.arcgisJsApiStrings.relationship = js.native
}
