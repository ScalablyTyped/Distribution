package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.tooltipMod.TooltipProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderTooltipMod extends Shortcut {
  
  @JSImport("antd/lib/slider/SliderTooltip", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TooltipProps & RefAttributes[Any]] = js.native
  
  type _To = ForwardRefExoticComponent[TooltipProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `sliderTooltipMod.foo` */
  override def _to: ForwardRefExoticComponent[TooltipProps & RefAttributes[Any]] = default
}
