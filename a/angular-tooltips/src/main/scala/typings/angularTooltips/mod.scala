package typings.angularTooltips

import org.scalablytyped.runtime.Shortcut
import typings.angularTooltips.angularTooltipsStrings.`720kbDottooltips`
import typings.angularTooltips.angularTooltipsStrings.`bottom left`
import typings.angularTooltips.angularTooltipsStrings.`bottom right`
import typings.angularTooltips.angularTooltipsStrings.`top left`
import typings.angularTooltips.angularTooltipsStrings.`top right`
import typings.angularTooltips.angularTooltipsStrings.bottom
import typings.angularTooltips.angularTooltipsStrings.fast
import typings.angularTooltips.angularTooltipsStrings.large
import typings.angularTooltips.angularTooltipsStrings.left
import typings.angularTooltips.angularTooltipsStrings.medium
import typings.angularTooltips.angularTooltipsStrings.right
import typings.angularTooltips.angularTooltipsStrings.slow
import typings.angularTooltips.angularTooltipsStrings.small
import typings.angularTooltips.angularTooltipsStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-tooltips", JSImport.Namespace)
  @js.native
  val ^ : `720kbDottooltips` = js.native
  
  trait TooltipsConfProvider extends StObject {
    
    def configure(options: TooltipsConfProviderOptions): Unit
  }
  object TooltipsConfProvider {
    
    inline def apply(configure: TooltipsConfProviderOptions => Unit): TooltipsConfProvider = {
      val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure))
      __obj.asInstanceOf[TooltipsConfProvider]
    }
    
    extension [Self <: TooltipsConfProvider](x: Self) {
      
      inline def setConfigure(value: TooltipsConfProviderOptions => Unit): Self = StObject.set(x, "configure", js.Any.fromFunction1(value))
    }
  }
  
  trait TooltipsConfProviderOptions extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var closeButton: js.UndefOr[Boolean] = js.undefined
    
    var hideTrigger: js.UndefOr[String] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var showTrigger: js.UndefOr[String] = js.undefined
    
    var side: js.UndefOr[
        left | right | top | bottom | (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`)
      ] = js.undefined
    
    var size: js.UndefOr[small | medium | large] = js.undefined
    
    var smart: js.UndefOr[Boolean] = js.undefined
    
    var speed: js.UndefOr[slow | medium | fast] = js.undefined
    
    var tooltipTemplateUrlCache: js.UndefOr[Boolean] = js.undefined
  }
  object TooltipsConfProviderOptions {
    
    inline def apply(): TooltipsConfProviderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipsConfProviderOptions]
    }
    
    extension [Self <: TooltipsConfProviderOptions](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setCloseButton(value: Boolean): Self = StObject.set(x, "closeButton", value.asInstanceOf[js.Any])
      
      inline def setCloseButtonUndefined: Self = StObject.set(x, "closeButton", js.undefined)
      
      inline def setHideTrigger(value: String): Self = StObject.set(x, "hideTrigger", value.asInstanceOf[js.Any])
      
      inline def setHideTriggerUndefined: Self = StObject.set(x, "hideTrigger", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowTrigger(value: String): Self = StObject.set(x, "showTrigger", value.asInstanceOf[js.Any])
      
      inline def setShowTriggerUndefined: Self = StObject.set(x, "showTrigger", js.undefined)
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setSide(
        value: left | right | top | bottom | (`top left`) | (`top right`) | (`bottom left`) | (`bottom right`)
      ): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
      
      inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
      
      inline def setSize(value: small | medium | large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSmart(value: Boolean): Self = StObject.set(x, "smart", value.asInstanceOf[js.Any])
      
      inline def setSmartUndefined: Self = StObject.set(x, "smart", js.undefined)
      
      inline def setSpeed(value: slow | medium | fast): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      inline def setTooltipTemplateUrlCache(value: Boolean): Self = StObject.set(x, "tooltipTemplateUrlCache", value.asInstanceOf[js.Any])
      
      inline def setTooltipTemplateUrlCacheUndefined: Self = StObject.set(x, "tooltipTemplateUrlCache", js.undefined)
    }
  }
  
  type _To = `720kbDottooltips`
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: `720kbDottooltips` = ^
}
