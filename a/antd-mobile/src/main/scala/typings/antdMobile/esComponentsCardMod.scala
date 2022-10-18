package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.esComponentsCardCardMod.CardProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsCardMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/card", JSImport.Default)
  @js.native
  val default: FC[CardProps] = js.native
  
  type _To = FC[CardProps]
  
  /* This means you don't have to write `default`, but can instead just say `esComponentsCardMod.foo` */
  override def _to: FC[CardProps] = default
}
