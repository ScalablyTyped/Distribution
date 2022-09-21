package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loginOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LoginOutlined", JSImport.Default)
  @js.native
  val default: LoginOutlinedIconType = js.native
  
  @js.native
  trait LoginOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LoginOutlinedIconType: String = js.native
  }
  
  type _To = LoginOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `loginOutlinedMod.foo` */
  override def _to: LoginOutlinedIconType = default
}
