package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGitlabOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GitlabOutlined", JSImport.Default)
  @js.native
  val default: GitlabOutlinedIconType = js.native
  
  @js.native
  trait GitlabOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_GitlabOutlinedIconType: String = js.native
  }
  
  type _To = GitlabOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGitlabOutlinedMod.foo` */
  override def _to: GitlabOutlinedIconType = default
}
