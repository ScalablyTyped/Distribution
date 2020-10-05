package typings.antd

import typings.antd.avatarAvatarMod.AvatarProps
import typings.antd.groupMod.GroupProps
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd/lib/avatar", JSImport.Namespace)
@js.native
object avatarMod extends js.Object {
  @js.native
  trait CompoundedComponent extends ForwardRefExoticComponent[AvatarProps with RefAttributes[HTMLElement]] {
    var Group: FC[GroupProps] = js.native
  }
  
  val Group: FC[GroupProps] = js.native
  val default: CompoundedComponent = js.native
}

