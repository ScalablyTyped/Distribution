package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsYoutubeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/YoutubeOutlined", JSImport.Default)
  @js.native
  val default: YoutubeOutlinedIconType = js.native
  
  @js.native
  trait YoutubeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_YoutubeOutlinedIconType: String = js.native
  }
  
  type _To = YoutubeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsYoutubeOutlinedMod.foo` */
  override def _to: YoutubeOutlinedIconType = default
}
