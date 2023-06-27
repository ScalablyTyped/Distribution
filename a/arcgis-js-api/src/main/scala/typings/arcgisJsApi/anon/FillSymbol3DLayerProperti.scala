package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.fill
import typings.arcgisJsApi.esri.Edges3DProperties
import typings.arcgisJsApi.esri.FillSymbol3DLayerMaterialProperties
import typings.arcgisJsApi.esri.FillSymbol3DLayerOutlineProperties
import typings.arcgisJsApi.esri.StylePattern3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.FillSymbol3DLayerProperties & {  type :'fill'} */
trait FillSymbol3DLayerProperti extends StObject {
  
  /**
  		 * Indicates whether the symbol layer geometry casts shadows in the scene.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#castShadows)
  		 */
  var castShadows: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Sets the contour edges on 3D Objects.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#edges)
  		 */
  var edges: js.UndefOr[Edges3DProperties] = js.undefined
  
  /**
  		 * The material defines the final color of the graphic, by blending the `color` property set in the material with the feature's geometry color/texture information.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
  		 */
  var material: js.UndefOr[FillSymbol3DLayerMaterialProperties] = js.undefined
  
  /**
  		 * The outline used to draw a line around the filled geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
  		 */
  var outline: js.UndefOr[FillSymbol3DLayerOutlineProperties] = js.undefined
  
  /**
  		 * The pattern used to render the polygon fill.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#pattern)
  		 */
  var pattern: js.UndefOr[StylePattern3DProperties] = js.undefined
  
  var `type`: fill
}
object FillSymbol3DLayerProperti {
  
  inline def apply(): FillSymbol3DLayerProperti = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("fill")
    __obj.asInstanceOf[FillSymbol3DLayerProperti]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillSymbol3DLayerProperti] (val x: Self) extends AnyVal {
    
    inline def setCastShadows(value: Boolean): Self = StObject.set(x, "castShadows", value.asInstanceOf[js.Any])
    
    inline def setCastShadowsUndefined: Self = StObject.set(x, "castShadows", js.undefined)
    
    inline def setEdges(value: Edges3DProperties): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    inline def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    inline def setMaterial(value: FillSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setOutline(value: FillSymbol3DLayerOutlineProperties): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setPattern(value: StylePattern3DProperties): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setType(value: fill): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
