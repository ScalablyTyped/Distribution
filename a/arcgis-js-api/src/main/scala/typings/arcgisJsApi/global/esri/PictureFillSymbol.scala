package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PictureFillSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PictureFillSymbol")
@js.native
/**
		 * PictureFillSymbol uses an image in a repeating pattern to symbolize polygon features in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PictureFillSymbol.html)
		 */
open class PictureFillSymbol ()
  extends StObject
     with typings.arcgisJsApi.esri.PictureFillSymbol {
  def this(properties: PictureFillSymbolProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object PictureFillSymbol {
  
  @JSGlobal("__esri.PictureFillSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PictureFillSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PictureFillSymbol]
}
