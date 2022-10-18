package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCodepenSquareFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CodepenSquareFilled", JSImport.Default)
  @js.native
  val default: CodepenSquareFilledIconType = js.native
  
  @js.native
  trait CodepenSquareFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CodepenSquareFilledIconType: String = js.native
  }
  
  type _To = CodepenSquareFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCodepenSquareFilledMod.foo` */
  override def _to: CodepenSquareFilledIconType = default
}
