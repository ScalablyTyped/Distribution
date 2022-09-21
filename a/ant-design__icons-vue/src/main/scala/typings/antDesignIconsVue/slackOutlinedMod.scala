package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slackOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SlackOutlined", JSImport.Default)
  @js.native
  val default: SlackOutlinedIconType = js.native
  
  @js.native
  trait SlackOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SlackOutlinedIconType: String = js.native
  }
  
  type _To = SlackOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `slackOutlinedMod.foo` */
  override def _to: SlackOutlinedIconType = default
}
