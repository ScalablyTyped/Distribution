package typings.antvComponent.libTypesMod

import typings.antvGBase.libTypesMod.ShapeAttrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLineCfg extends StObject {
  
  /**
    * 坐标轴线的配置项
    * @type {ShapeAttrs}
    */
  var style: js.UndefOr[ShapeAttrs] = js.undefined
}
object AxisLineCfg {
  
  inline def apply(): AxisLineCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLineCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisLineCfg] (val x: Self) extends AnyVal {
    
    inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
