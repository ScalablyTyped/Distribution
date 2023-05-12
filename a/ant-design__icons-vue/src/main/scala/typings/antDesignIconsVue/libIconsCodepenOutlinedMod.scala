package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCodepenOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CodepenOutlined", JSImport.Default)
  @js.native
  val default: CodepenOutlinedIconType = js.native
  
  @js.native
  trait CodepenOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CodepenOutlinedIconType: String = js.native
  }
  
  type _To = CodepenOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCodepenOutlinedMod.foo` */
  override def _to: CodepenOutlinedIconType = default
}
