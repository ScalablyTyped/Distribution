package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.butt_
import typings.arcgisJsApi.arcgisJsApiStrings.round_
import typings.arcgisJsApi.arcgisJsApiStrings.square_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillSymbol3DLayerOutline
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The color of the outline.
    *
    * @default black
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var color: js.UndefOr[Color_] = js.undefined
  
  /**
    * The stroke pattern used to render the outline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var pattern: js.UndefOr[LineStylePattern3D] = js.undefined
  
  /**
    * The style applied to the tips of each pattern segment along the line.
    *
    * @default butt
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var patternCap: js.UndefOr[butt_ | round_ | square_] = js.undefined
  
  /**
    * The width of the outline in points.
    *
    * @default 1px
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html#outline)
    */
  var size: js.UndefOr[Double] = js.undefined
}
object FillSymbol3DLayerOutline {
  
  inline def apply(): FillSymbol3DLayerOutline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillSymbol3DLayerOutline]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FillSymbol3DLayerOutline] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPattern(value: LineStylePattern3D): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternCap(value: butt_ | round_ | square_): Self = StObject.set(x, "patternCap", value.asInstanceOf[js.Any])
    
    inline def setPatternCapUndefined: Self = StObject.set(x, "patternCap", js.undefined)
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
