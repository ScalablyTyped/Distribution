package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeSandboxSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CodeSandboxSquareFilled", JSImport.Default)
  @js.native
  val default: CodeSandboxSquareFilledIconType = js.native
  
  @js.native
  trait CodeSandboxSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CodeSandboxSquareFilledIconType: String = js.native
  }
  
  type _To = CodeSandboxSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `codeSandboxSquareFilledMod.foo` */
  override def _to: CodeSandboxSquareFilledIconType = default
}
