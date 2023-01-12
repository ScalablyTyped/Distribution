package typings.antvComponent.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptimizeCfg extends StObject {
  
  /** 是否启动大数据量优化 */
  var enable: Boolean
  
  /** 大数据数据量配置，达到 threshold 后启动优化，默认 400 */
  var threshold: js.UndefOr[Double] = js.undefined
}
object OptimizeCfg {
  
  inline def apply(enable: Boolean): OptimizeCfg = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptimizeCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptimizeCfg] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
