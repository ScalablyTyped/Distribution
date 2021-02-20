package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillSymbol3DLayerProperties extends Symbol3DLayerProperties {
  
  /**
    * Indicates whether the symbol layer geometry casts shadows in the scene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#castShadows)
    */
  var castShadows: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the contour edges on 3D Objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#edges)
    */
  var edges: js.UndefOr[Edges3DProperties] = js.native
  
  /**
    * The material defines the final color of the graphic, by blending the `color` property set in the material with the feature's geometry color/texture information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[FillSymbol3DLayerMaterialProperties] = js.native
  
  /**
    * The outline used to draw a line around the filled geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var outline: js.UndefOr[FillSymbol3DLayerOutlineProperties] = js.native
  
  /**
    * The pattern used to render the polygon fill.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#pattern)
    */
  var pattern: js.UndefOr[StylePattern3DProperties] = js.native
}
object FillSymbol3DLayerProperties {
  
  @scala.inline
  def apply(): FillSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillSymbol3DLayerProperties]
  }
  
  @scala.inline
  implicit class FillSymbol3DLayerPropertiesMutableBuilder[Self <: FillSymbol3DLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCastShadows(value: Boolean): Self = StObject.set(x, "castShadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCastShadowsUndefined: Self = StObject.set(x, "castShadows", js.undefined)
    
    @scala.inline
    def setEdges(value: Edges3DProperties): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgesUndefined: Self = StObject.set(x, "edges", js.undefined)
    
    @scala.inline
    def setMaterial(value: FillSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    @scala.inline
    def setOutline(value: FillSymbol3DLayerOutlineProperties): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setPattern(value: StylePattern3DProperties): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
