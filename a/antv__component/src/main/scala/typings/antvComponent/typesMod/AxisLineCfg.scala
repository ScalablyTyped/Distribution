package typings.antvComponent.typesMod

import typings.antvGBase.typesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisLineCfg extends StObject {
  
  /**
    * 坐标轴线的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.native
}
object AxisLineCfg {
  
  @scala.inline
  def apply(): AxisLineCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLineCfg]
  }
  
  @scala.inline
  implicit class AxisLineCfgMutableBuilder[Self <: AxisLineCfg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
