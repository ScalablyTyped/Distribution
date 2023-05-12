package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCodeSandboxOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CodeSandboxOutlined", JSImport.Default)
  @js.native
  val default: CodeSandboxOutlinedIconType = js.native
  
  @js.native
  trait CodeSandboxOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CodeSandboxOutlinedIconType: String = js.native
  }
  
  type _To = CodeSandboxOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCodeSandboxOutlinedMod.foo` */
  override def _to: CodeSandboxOutlinedIconType = default
}
