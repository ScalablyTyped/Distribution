package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsUserAddOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/UserAddOutlined", JSImport.Default)
  @js.native
  val default: UserAddOutlinedIconType = js.native
  
  @js.native
  trait UserAddOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_UserAddOutlinedIconType: String = js.native
  }
  
  type _To = UserAddOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsUserAddOutlinedMod.foo` */
  override def _to: UserAddOutlinedIconType = default
}
