package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libAvatarAvatarMod.AvatarProps
import typings.antd.libAvatarGroupMod.GroupProps
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAvatarMod extends Shortcut {
  
  @JSImport("antd/lib/avatar", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/lib/avatar", "Group")
  @js.native
  val Group: FC[GroupProps] = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[AvatarProps & RefAttributes[HTMLSpanElement]] {
    
    var Group: FC[GroupProps] = js.native
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libAvatarMod.foo` */
  override def _to: CompoundedComponent = default
}
