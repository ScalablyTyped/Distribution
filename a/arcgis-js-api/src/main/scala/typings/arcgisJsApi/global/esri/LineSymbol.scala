package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.LineSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.LineSymbol")
@js.native
/**
		 * Line symbols are used to draw [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html)
		 */
open class LineSymbol ()
  extends StObject
     with typings.arcgisJsApi.esri.LineSymbol {
  def this(properties: LineSymbolProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object LineSymbol {
  
  @JSGlobal("__esri.LineSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.LineSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.LineSymbol]
}
