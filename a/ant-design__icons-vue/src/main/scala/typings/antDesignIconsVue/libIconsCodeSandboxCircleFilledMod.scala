package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCodeSandboxCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CodeSandboxCircleFilled", JSImport.Default)
  @js.native
  val default: CodeSandboxCircleFilledIconType = js.native
  
  @js.native
  trait CodeSandboxCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CodeSandboxCircleFilledIconType: String = js.native
  }
  
  type _To = CodeSandboxCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCodeSandboxCircleFilledMod.foo` */
  override def _to: CodeSandboxCircleFilledIconType = default
}
