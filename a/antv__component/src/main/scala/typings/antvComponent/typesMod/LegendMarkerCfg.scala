package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendMarkerCfg extends js.Object {
  
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
  implicit class LegendMarkerCfgOps[Self <: LegendMarkerCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSpacing(value: Double): Self = this.set("spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpacing: Self = this.set("spacing", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSymbolFunction3(value: (/* x */ Double, /* y */ Double, /* r */ Double) => _): Self = this.set("symbol", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSymbol(value: String | (js.Function3[/* x */ Double, /* y */ Double, /* r */ Double, _])): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
  }
}
