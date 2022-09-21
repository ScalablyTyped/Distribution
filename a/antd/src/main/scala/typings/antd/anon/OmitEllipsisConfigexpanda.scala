package typings.antd.anon

import typings.antd.tooltipMod.TooltipProps
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<antd.antd/lib/typography/Base.EllipsisConfig, 'expandable' | 'rows' | 'onExpand'> */
trait OmitEllipsisConfigexpanda extends StObject {
  
  var onEllipsis: js.UndefOr[js.Function1[/* ellipsis */ Boolean, Unit]] = js.undefined
  
  var suffix: js.UndefOr[String] = js.undefined
  
  var symbol: js.UndefOr[ReactNode] = js.undefined
  
  var tooltip: js.UndefOr[ReactNode | TooltipProps] = js.undefined
}
object OmitEllipsisConfigexpanda {
  
  inline def apply(): OmitEllipsisConfigexpanda = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitEllipsisConfigexpanda]
  }
  
  extension [Self <: OmitEllipsisConfigexpanda](x: Self) {
    
    inline def setOnEllipsis(value: /* ellipsis */ Boolean => Unit): Self = StObject.set(x, "onEllipsis", js.Any.fromFunction1(value))
    
    inline def setOnEllipsisUndefined: Self = StObject.set(x, "onEllipsis", js.undefined)
    
    inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
    
    inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    
    inline def setSymbol(value: ReactNode): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    inline def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    inline def setTooltip(value: ReactNode | TooltipProps): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
