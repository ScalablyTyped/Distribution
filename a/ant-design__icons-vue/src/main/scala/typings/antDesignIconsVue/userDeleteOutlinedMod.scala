package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userDeleteOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UserDeleteOutlined", JSImport.Default)
  @js.native
  val default: UserDeleteOutlinedIconType = js.native
  
  @js.native
  trait UserDeleteOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UserDeleteOutlinedIconType: String = js.native
  }
  
  type _To = UserDeleteOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `userDeleteOutlinedMod.foo` */
  override def _to: UserDeleteOutlinedIconType = default
}
