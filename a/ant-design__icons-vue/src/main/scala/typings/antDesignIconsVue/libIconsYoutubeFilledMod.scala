package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsYoutubeFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/YoutubeFilled", JSImport.Default)
  @js.native
  val default: YoutubeFilledIconType = js.native
  
  @js.native
  trait YoutubeFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_YoutubeFilledIconType: String = js.native
  }
  
  type _To = YoutubeFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsYoutubeFilledMod.foo` */
  override def _to: YoutubeFilledIconType = default
}
