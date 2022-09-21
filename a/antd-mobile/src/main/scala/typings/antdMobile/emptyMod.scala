package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.emptyEmptyMod.EmptyProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emptyMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/empty", JSImport.Default)
  @js.native
  val default: FC[EmptyProps] = js.native
  
  type _To = FC[EmptyProps]
  
  /* This means you don't have to write `default`, but can instead just say `emptyMod.foo` */
  override def _to: FC[EmptyProps] = default
}
