package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.Symbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Symbol3DLayer")
@js.native
/**
		 * Symbol layers are used to define the visualization of [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html), and mesh geometries rendered with [3D symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html)
		 */
open class Symbol3DLayer ()
  extends StObject
     with typings.arcgisJsApi.esri.Symbol3DLayer {
  def this(properties: Symbol3DLayerProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object Symbol3DLayer {
  
  @JSGlobal("__esri.Symbol3DLayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.Symbol3DLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.Symbol3DLayer]
}
