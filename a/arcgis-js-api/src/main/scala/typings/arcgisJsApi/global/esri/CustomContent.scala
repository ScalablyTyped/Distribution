package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.CustomContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.CustomContent")
@js.native
/**
  * A `CustomContent` popup element is used to provide a way to customize the [popup's](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) content.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html)
  */
open class CustomContent ()
  extends StObject
     with typings.arcgisJsApi.esri.CustomContent {
  def this(properties: CustomContentProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object CustomContent {
  
  @JSGlobal("__esri.CustomContent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.CustomContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.CustomContent]
}
