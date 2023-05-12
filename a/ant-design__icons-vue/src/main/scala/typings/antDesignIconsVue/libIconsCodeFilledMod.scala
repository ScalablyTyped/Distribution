package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCodeFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CodeFilled", JSImport.Default)
  @js.native
  val default: CodeFilledIconType = js.native
  
  @js.native
  trait CodeFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CodeFilledIconType: String = js.native
  }
  
  type _To = CodeFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCodeFilledMod.foo` */
  override def _to: CodeFilledIconType = default
}
