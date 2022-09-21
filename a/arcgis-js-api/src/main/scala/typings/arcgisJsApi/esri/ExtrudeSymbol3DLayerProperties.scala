package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtrudeSymbol3DLayerProperties
  extends StObject
     with Symbol3DLayerProperties {
  
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#castShadows)
    */
  var castShadows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the contour edges on polygons symbolized with ExtrudeSymbol3DLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#edges)
    */
  var edges: js.UndefOr[Edges3DProperties] = js.undefined
  
  /**
    * The material used to shade the extrusion.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[ExtrudeSymbol3DLayerMaterialProperties] = js.undefined
  
  /**
    * The height of the extrusion in meters.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html#size)
    */
  var size: js.UndefOr[Double] = js.undefined
}
object ExtrudeSymbol3DLayerProperties {
  
  inline def apply(): ExtrudeSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtrudeSymbol3DLayerProperties]
  }
  
  extension [Self <: ExtrudeSymbol3DLayerProperties](x: Self) {
    
    inline def setCastShadows(value: Boolean): Self = StObject.set(x, "castShadows", value.asInstanceOf[js.Any])
    
    inline def setCastShadowsUndefined: Self = StObject.set(x, "castShadows", js.undefined)
    
    inline def setEdges(value: Edges3DProperties): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setMaterial(value: ExtrudeSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
