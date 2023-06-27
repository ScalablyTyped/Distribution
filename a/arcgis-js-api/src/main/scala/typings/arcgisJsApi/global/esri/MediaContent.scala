package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MediaContentProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.MediaContent")
@js.native
/**
		 * A `MediaContent` popup element contains an individual or array of chart and/or image media elements to display within a popup's content.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-MediaContent.html)
		 */
open class MediaContent ()
  extends StObject
     with typings.arcgisJsApi.esri.MediaContent {
  def this(properties: MediaContentProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object MediaContent {
  
  @JSGlobal("__esri.MediaContent")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.MediaContent = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.MediaContent]
}
