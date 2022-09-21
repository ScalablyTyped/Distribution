package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object womanOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/WomanOutlined", JSImport.Default)
  @js.native
  val default: WomanOutlinedIconType = js.native
  
  @js.native
  trait WomanOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_WomanOutlinedIconType: String = js.native
  }
  
  type _To = WomanOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `womanOutlinedMod.foo` */
  override def _to: WomanOutlinedIconType = default
}
