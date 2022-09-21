package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.dividerDividerMod.DividerProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/divider", JSImport.Default)
  @js.native
  val default: FC[DividerProps] = js.native
  
  type _To = FC[DividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `dividerMod.foo` */
  override def _to: FC[DividerProps] = default
}
