package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.MarkerSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.MarkerSymbol")
@js.native
/**
  * Marker symbols are used to draw [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) graphics in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or individual [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html)
  */
open class MarkerSymbol ()
  extends StObject
     with typings.arcgisJsApi.esri.MarkerSymbol {
  def this(properties: MarkerSymbolProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object MarkerSymbol {
  
  @JSGlobal("__esri.MarkerSymbol")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.MarkerSymbol = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.MarkerSymbol]
}
