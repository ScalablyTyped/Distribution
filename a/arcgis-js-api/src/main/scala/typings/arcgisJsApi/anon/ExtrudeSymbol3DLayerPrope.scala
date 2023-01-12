package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.extrude
import typings.arcgisJsApi.esri.Edges3DProperties
import typings.arcgisJsApi.esri.ExtrudeSymbol3DLayerMaterialProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ExtrudeSymbol3DLayerProperties & {  type :'extrude'} */
trait ExtrudeSymbol3DLayerPrope extends StObject {
  
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
  
  var `type`: extrude
}
object ExtrudeSymbol3DLayerPrope {
  
  inline def apply(): ExtrudeSymbol3DLayerPrope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("extrude")
    __obj.asInstanceOf[ExtrudeSymbol3DLayerPrope]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtrudeSymbol3DLayerPrope] (val x: Self) extends AnyVal {
    
    inline def setCastShadows(value: Boolean): Self = StObject.set(x, "castShadows", value.asInstanceOf[js.Any])
    
    inline def setCastShadowsUndefined: Self = StObject.set(x, "castShadows", js.undefined)
    
    inline def setEdges(value: Edges3DProperties): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setMaterial(value: ExtrudeSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setType(value: extrude): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
