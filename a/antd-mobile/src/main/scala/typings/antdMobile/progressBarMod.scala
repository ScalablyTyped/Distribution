package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.progressBarProgressBarMod.ProgressBarProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object progressBarMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/progress-bar", JSImport.Default)
  @js.native
  val default: FC[ProgressBarProps] = js.native
  
  type _To = FC[ProgressBarProps]
  
  /* This means you don't have to write `default`, but can instead just say `progressBarMod.foo` */
  override def _to: FC[ProgressBarProps] = default
}
