package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSlackOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SlackOutlined", JSImport.Default)
  @js.native
  val default: SlackOutlinedIconType = js.native
  
  @js.native
  trait SlackOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SlackOutlinedIconType: String = js.native
  }
  
  type _To = SlackOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSlackOutlinedMod.foo` */
  override def _to: SlackOutlinedIconType = default
}
