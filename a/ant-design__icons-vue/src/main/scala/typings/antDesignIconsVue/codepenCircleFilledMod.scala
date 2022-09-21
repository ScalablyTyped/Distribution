package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object codepenCircleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CodepenCircleFilled", JSImport.Default)
  @js.native
  val default: CodepenCircleFilledIconType = js.native
  
  @js.native
  trait CodepenCircleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CodepenCircleFilledIconType: String = js.native
  }
  
  type _To = CodepenCircleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `codepenCircleFilledMod.foo` */
  override def _to: CodepenCircleFilledIconType = default
}
