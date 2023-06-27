package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.PathSymbol3DLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.PathSymbol3DLayer")
@js.native
/**
		 * PathSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries by extruding a 2D profile along the line.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html)
		 */
open class PathSymbol3DLayer ()
  extends StObject
     with typings.arcgisJsApi.esri.PathSymbol3DLayer {
  def this(properties: PathSymbol3DLayerProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object PathSymbol3DLayer {
  
  @JSGlobal("__esri.PathSymbol3DLayer")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.PathSymbol3DLayer = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.PathSymbol3DLayer]
}
