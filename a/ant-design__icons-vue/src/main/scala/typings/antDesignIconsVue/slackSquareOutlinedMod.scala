package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object slackSquareOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SlackSquareOutlined", JSImport.Default)
  @js.native
  val default: SlackSquareOutlinedIconType = js.native
  
  @js.native
  trait SlackSquareOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SlackSquareOutlinedIconType: String = js.native
  }
  
  type _To = SlackSquareOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `slackSquareOutlinedMod.foo` */
  override def _to: SlackSquareOutlinedIconType = default
}
