package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/plots/funnel/types.FunnelOptions, 'yField' | 'maxSize' | 'minSize'> */
trait PickFunnelOptionsyFieldma extends StObject {
  
  var maxSize: js.UndefOr[Double] = js.undefined
  
  var minSize: js.UndefOr[Double] = js.undefined
  
  var yField: js.UndefOr[String] = js.undefined
}
object PickFunnelOptionsyFieldma {
  
  inline def apply(): PickFunnelOptionsyFieldma = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickFunnelOptionsyFieldma]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickFunnelOptionsyFieldma] (val x: Self) extends AnyVal {
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: Double): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    
    inline def setYFieldUndefined: Self = StObject.set(x, "yField", js.undefined)
  }
}
