package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.safeAreaSafeAreaMod.SafeAreaProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeAreaMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/safe-area", JSImport.Default)
  @js.native
  val default: FC[SafeAreaProps] = js.native
  
  type _To = FC[SafeAreaProps]
  
  /* This means you don't have to write `default`, but can instead just say `safeAreaMod.foo` */
  override def _to: FC[SafeAreaProps] = default
}
