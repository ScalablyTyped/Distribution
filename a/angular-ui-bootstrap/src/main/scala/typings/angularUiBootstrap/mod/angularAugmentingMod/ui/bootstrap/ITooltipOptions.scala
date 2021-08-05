package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITooltipOptions extends StObject {
  
  /**
    * Should the modal fade in and out?
    *
    * @default true
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Should the tooltip be appended to `$body` instead of the parent element?
    *
    * @default false
    */
  var appendToBody: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Where to place it? Defaults to 'top', but also accepts 'right', 'bottom', or 'left'.
    *
    * @default 'top'
    */
  var placement: js.UndefOr[String] = js.undefined
  
  /**
    * For how long should the tooltip remain open after the close trigger event?
    *
    * @default 0
    */
  var popupCloseDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * Popup delay in milliseconds until it opens.
    *
    * @default 0
    */
  var popupDelay: js.UndefOr[Double] = js.undefined
  
  /**
    * What should trigger a show of the tooltip? Supports a space separated list of event names.
    *
    * @default 'mouseenter' for tooltip, 'click' for popover
    */
  var trigger: js.UndefOr[String] = js.undefined
  
  /**
    * Should an expression on the scope be used to load the content?
    *
    * @default false
    */
  var useContentExp: js.UndefOr[Boolean] = js.undefined
}
object ITooltipOptions {
  
  inline def apply(): ITooltipOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITooltipOptions]
  }
  
  extension [Self <: ITooltipOptions](x: Self) {
    
    inline def setAnimation(value: Boolean): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setAppendToBody(value: Boolean): Self = StObject.set(x, "appendToBody", value.asInstanceOf[js.Any])
    
    inline def setAppendToBodyUndefined: Self = StObject.set(x, "appendToBody", js.undefined)
    
    inline def setPlacement(value: String): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setPopupCloseDelay(value: Double): Self = StObject.set(x, "popupCloseDelay", value.asInstanceOf[js.Any])
    
    inline def setPopupCloseDelayUndefined: Self = StObject.set(x, "popupCloseDelay", js.undefined)
    
    inline def setPopupDelay(value: Double): Self = StObject.set(x, "popupDelay", value.asInstanceOf[js.Any])
    
    inline def setPopupDelayUndefined: Self = StObject.set(x, "popupDelay", js.undefined)
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setUseContentExp(value: Boolean): Self = StObject.set(x, "useContentExp", value.asInstanceOf[js.Any])
    
    inline def setUseContentExpUndefined: Self = StObject.set(x, "useContentExp", js.undefined)
  }
}
