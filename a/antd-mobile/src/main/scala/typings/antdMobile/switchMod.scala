package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.switchSwitchMod.SwitchProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switchMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/switch", JSImport.Default)
  @js.native
  val default: FC[SwitchProps] = js.native
  
  type _To = FC[SwitchProps]
  
  /* This means you don't have to write `default`, but can instead just say `switchMod.foo` */
  override def _to: FC[SwitchProps] = default
}
