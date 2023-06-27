package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.TextContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.TextContent")
@js.native
/**
		 * A `TextContent` popup element is used to define descriptive text as an element within a [PopupTemplate's](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) content.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html)
		 */
open class TextContent ()
  extends StObject
     with typings.arcgisJsApi.esri.TextContent {
  def this(properties: TextContentProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object TextContent {
  
  @JSGlobal("__esri.TextContent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.TextContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.TextContent]
}
