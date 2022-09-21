package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codeTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CodeTwoTone", JSImport.Default)
  @js.native
  val default: CodeTwoToneIconType = js.native
  
  @js.native
  trait CodeTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CodeTwoToneIconType: String = js.native
  }
  
  type _To = CodeTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `codeTwoToneMod.foo` */
  override def _to: CodeTwoToneIconType = default
}
