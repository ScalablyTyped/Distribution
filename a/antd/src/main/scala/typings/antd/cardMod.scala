package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.cardCardMod.CardProps
import typings.antd.gridMod.CardGridProps
import typings.antd.metaMod.CardMetaProps
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod extends Shortcut {
  
  @JSImport("antd/lib/card", JSImport.Default)
  @js.native
  val default: CardInterface = js.native
  
  @js.native
  trait CardInterface
    extends StObject
       with ForwardRefExoticComponent[CardProps & RefAttributes[HTMLDivElement]] {
    
    var Grid: FC[CardGridProps] = js.native
    
    var Meta: FC[CardMetaProps] = js.native
  }
  
  type InternalCardType = ForwardRefExoticComponent[CardProps & RefAttributes[HTMLDivElement]]
  
  type _To = CardInterface
  
  /* This means you don't have to write `default`, but can instead just say `cardMod.foo` */
  override def _to: CardInterface = default
}
