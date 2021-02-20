package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendMarkerCfg extends StObject {
  
  /**
    * 图例项 marker 同后面 name 的间距
    * @type {number}
    */
  var spacing: js.UndefOr[Double] = js.native
  
  /**
    * 图例项 marker 的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
  
  /**
    * 图例 marker 形状
    */
  var symbol: js.UndefOr[String | (js.Function3[/* x */ Double, /* y */ Double, /* r */ Double, _])] = js.native
}
object LegendMarkerCfg {
  
  @scala.inline
  def apply(): LegendMarkerCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendMarkerCfg]
  }
  
  @scala.inline
  implicit class LegendMarkerCfgMutableBuilder[Self <: LegendMarkerCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setSymbol(value: String | (js.Function3[/* x */ Double, /* y */ Double, /* r */ Double, _])): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolFunction3(value: (/* x */ Double, /* y */ Double, /* r */ Double) => _): Self = StObject.set(x, "symbol", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
  }
}
