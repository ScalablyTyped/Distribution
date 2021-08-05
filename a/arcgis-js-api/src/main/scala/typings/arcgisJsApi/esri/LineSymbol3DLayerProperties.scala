package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.bevel
import typings.arcgisJsApi.arcgisJsApiStrings.butt
import typings.arcgisJsApi.arcgisJsApiStrings.miter
import typings.arcgisJsApi.arcgisJsApiStrings.round
import typings.arcgisJsApi.arcgisJsApiStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineSymbol3DLayerProperties
  extends StObject
     with Symbol3DLayerProperties {
  
  /**
    * The style used to draw the endpoint of a line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#cap)
    */
  var cap: js.UndefOr[butt | round | square] = js.undefined
  
  /**
    * The style used to draw the intersection of two line segments within a line geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#join)
    */
  var join: js.UndefOr[miter | round | bevel] = js.undefined
  
  /**
    * The material used to shade the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#material)
    */
  var material: js.UndefOr[LineSymbol3DLayerMaterialProperties] = js.undefined
  
  /**
    * The width of the line in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html#size)
    */
  var size: js.UndefOr[Double | String] = js.undefined
}
object LineSymbol3DLayerProperties {
  
  inline def apply(): LineSymbol3DLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSymbol3DLayerProperties]
  }
  
  extension [Self <: LineSymbol3DLayerProperties](x: Self) {
    
    inline def setCap(value: butt | round | square): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    inline def setJoin(value: miter | round | bevel): Self = StObject.set(x, "join", value.asInstanceOf[js.Any])
    
    inline def setJoinUndefined: Self = StObject.set(x, "join", js.undefined)
    
    inline def setMaterial(value: LineSymbol3DLayerMaterialProperties): Self = StObject.set(x, "material", value.asInstanceOf[js.Any])
    
    inline def setMaterialUndefined: Self = StObject.set(x, "material", js.undefined)
    
    inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
