package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.sliderSliderMod.SliderProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/slider", JSImport.Default)
  @js.native
  val default: FC[SliderProps] = js.native
  
  type _To = FC[SliderProps]
  
  /* This means you don't have to write `default`, but can instead just say `sliderMod.foo` */
  override def _to: FC[SliderProps] = default
}
