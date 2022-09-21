package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codepenCircleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CodepenCircleOutlined", JSImport.Default)
  @js.native
  val default: CodepenCircleOutlinedIconType = js.native
  
  @js.native
  trait CodepenCircleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CodepenCircleOutlinedIconType: String = js.native
  }
  
  type _To = CodepenCircleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `codepenCircleOutlinedMod.foo` */
  override def _to: CodepenCircleOutlinedIconType = default
}
