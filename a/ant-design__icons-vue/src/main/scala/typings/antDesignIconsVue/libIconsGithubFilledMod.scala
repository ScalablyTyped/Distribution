package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsGithubFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GithubFilled", JSImport.Default)
  @js.native
  val default: GithubFilledIconType = js.native
  
  @js.native
  trait GithubFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_GithubFilledIconType: String = js.native
  }
  
  type _To = GithubFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsGithubFilledMod.foo` */
  override def _to: GithubFilledIconType = default
}
