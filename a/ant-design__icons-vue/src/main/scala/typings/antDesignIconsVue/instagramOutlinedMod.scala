package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instagramOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/InstagramOutlined", JSImport.Default)
  @js.native
  val default: InstagramOutlinedIconType = js.native
  
  @js.native
  trait InstagramOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_InstagramOutlinedIconType: String = js.native
  }
  
  type _To = InstagramOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `instagramOutlinedMod.foo` */
  override def _to: InstagramOutlinedIconType = default
}
