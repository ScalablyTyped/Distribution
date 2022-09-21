package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitlabFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/GitlabFilled", JSImport.Default)
  @js.native
  val default: GitlabFilledIconType = js.native
  
  @js.native
  trait GitlabFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_GitlabFilledIconType: String = js.native
  }
  
  type _To = GitlabFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `gitlabFilledMod.foo` */
  override def _to: GitlabFilledIconType = default
}
