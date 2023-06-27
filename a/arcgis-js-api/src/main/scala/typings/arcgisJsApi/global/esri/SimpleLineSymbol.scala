package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.SimpleLineSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.SimpleLineSymbol")
@js.native
/**
		 * SimpleLineSymbol is used for rendering 2D [polyline geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html)
		 */
open class SimpleLineSymbol ()
  extends StObject
     with typings.arcgisJsApi.esri.SimpleLineSymbol {
  def this(properties: SimpleLineSymbolProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object SimpleLineSymbol {
  
  @JSGlobal("__esri.SimpleLineSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.SimpleLineSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.SimpleLineSymbol]
}
