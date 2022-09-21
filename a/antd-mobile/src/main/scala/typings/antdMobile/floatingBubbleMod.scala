package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.floatingBubbleFloatingBubbleMod.FloatingBubbleProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object floatingBubbleMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/floating-bubble", JSImport.Default)
  @js.native
  val default: FC[FloatingBubbleProps] = js.native
  
  type _To = FC[FloatingBubbleProps]
  
  /* This means you don't have to write `default`, but can instead just say `floatingBubbleMod.foo` */
  override def _to: FC[FloatingBubbleProps] = default
}
