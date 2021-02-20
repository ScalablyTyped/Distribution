package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinueLegendRailCfg extends StObject {
  
  /**
    * 滑轨的默认长度，，当限制了 maxWidth,maxHeight 时，不会使用这个属性会自动计算长度
    * @type {number}
    */
  var defaultLength: js.UndefOr[Double] = js.native
  
  /**
    * 滑轨的宽度
    * @type {number}
    */
  var size: js.UndefOr[Double] = js.native
  
  /**
    * 滑轨的样式
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
  
  /**
    * rail 的类型，color, size
    * @type {string}
    */
  var `type`: js.UndefOr[String] = js.native
}
object ContinueLegendRailCfg {
  
  @scala.inline
  def apply(): ContinueLegendRailCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContinueLegendRailCfg]
  }
  
  @scala.inline
  implicit class ContinueLegendRailCfgMutableBuilder[Self <: ContinueLegendRailCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultLength(value: Double): Self = StObject.set(x, "defaultLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultLengthUndefined: Self = StObject.set(x, "defaultLength", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
