package typings.antvG2plot.anon

import typings.antvG2plot.libTypesTooltipMod.Tooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/types.Options, 'tooltip'> */
trait PickOptionstooltip extends StObject {
  
  var tooltip: js.UndefOr[Tooltip] = js.undefined
}
object PickOptionstooltip {
  
  inline def apply(): PickOptionstooltip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickOptionstooltip]
  }
  
  extension [Self <: PickOptionstooltip](x: Self) {
    
    inline def setTooltip(value: Tooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
