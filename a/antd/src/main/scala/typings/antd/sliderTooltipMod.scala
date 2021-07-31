package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.tooltipMod.TooltipPropsWithOverlay
import typings.antd.tooltipMod.TooltipPropsWithTitle
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderTooltipMod extends Shortcut {
  
  @JSImport("antd/lib/slider/SliderTooltip", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[
    (TooltipPropsWithOverlay & RefAttributes[js.Any]) | (TooltipPropsWithTitle & RefAttributes[js.Any])
  ] = js.native
  
  type _To = ForwardRefExoticComponent[
    (TooltipPropsWithOverlay & RefAttributes[js.Any]) | (TooltipPropsWithTitle & RefAttributes[js.Any])
  ]
  
  /* This means you don't have to write `default`, but can instead just say `sliderTooltipMod.foo` */
  override def _to: ForwardRefExoticComponent[
    (TooltipPropsWithOverlay & RefAttributes[js.Any]) | (TooltipPropsWithTitle & RefAttributes[js.Any])
  ] = default
}
