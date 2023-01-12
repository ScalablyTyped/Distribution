package typings.antvComponent.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLabelAutoHideCfg extends StObject {
  
  /** 最小间距配置 */
  var minGap: js.UndefOr[Double] = js.undefined
}
object AxisLabelAutoHideCfg {
  
  inline def apply(): AxisLabelAutoHideCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLabelAutoHideCfg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisLabelAutoHideCfg] (val x: Self) extends AnyVal {
    
    inline def setMinGap(value: Double): Self = StObject.set(x, "minGap", value.asInstanceOf[js.Any])
    
    inline def setMinGapUndefined: Self = StObject.set(x, "minGap", js.undefined)
  }
}
