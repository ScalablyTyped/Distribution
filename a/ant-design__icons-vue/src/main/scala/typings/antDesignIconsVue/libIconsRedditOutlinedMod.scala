package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRedditOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RedditOutlined", JSImport.Default)
  @js.native
  val default: RedditOutlinedIconType = js.native
  
  @js.native
  trait RedditOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RedditOutlinedIconType: String = js.native
  }
  
  type _To = RedditOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRedditOutlinedMod.foo` */
  override def _to: RedditOutlinedIconType = default
}
