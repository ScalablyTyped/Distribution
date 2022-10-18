package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGithubOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GithubOutlined", JSImport.Default)
  @js.native
  val default: GithubOutlinedIconType = js.native
  
  @js.native
  trait GithubOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_GithubOutlinedIconType: String = js.native
  }
  
  type _To = GithubOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGithubOutlinedMod.foo` */
  override def _to: GithubOutlinedIconType = default
}
