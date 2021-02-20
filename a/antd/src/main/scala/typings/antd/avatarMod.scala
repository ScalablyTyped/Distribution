package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.avatarAvatarMod.AvatarProps
import typings.antd.groupMod.GroupProps
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod extends Shortcut {
  
  @JSImport("antd/lib/avatar", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/lib/avatar", "Group")
  @js.native
  val Group: FC[GroupProps] = js.native
  
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[AvatarProps with RefAttributes[HTMLElement]] {
    
    var Group: FC[GroupProps] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `avatarMod.foo` */
  override def _to: CompoundedComponent = default
}
