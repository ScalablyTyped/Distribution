package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CodeOutlined", JSImport.Default)
  @js.native
  val default: CodeOutlinedIconType = js.native
  
  @js.native
  trait CodeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CodeOutlinedIconType: String = js.native
  }
  
  type _To = CodeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `codeOutlinedMod.foo` */
  override def _to: CodeOutlinedIconType = default
}
