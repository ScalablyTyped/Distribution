package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.avatarAvatarMod.AvatarProps
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/avatar", JSImport.Default)
  @js.native
  val default: FC[AvatarProps] = js.native
  
  type _To = FC[AvatarProps]
  
  /* This means you don't have to write `default`, but can instead just say `avatarMod.foo` */
  override def _to: FC[AvatarProps] = default
}
