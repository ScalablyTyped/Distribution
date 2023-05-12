package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPullRequestOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PullRequestOutlined", JSImport.Default)
  @js.native
  val default: PullRequestOutlinedIconType = js.native
  
  @js.native
  trait PullRequestOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PullRequestOutlinedIconType: String = js.native
  }
  
  type _To = PullRequestOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPullRequestOutlinedMod.foo` */
  override def _to: PullRequestOutlinedIconType = default
}
