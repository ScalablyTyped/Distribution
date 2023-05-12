package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFunctionOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FunctionOutlined", JSImport.Default)
  @js.native
  val default: FunctionOutlinedIconType = js.native
  
  @js.native
  trait FunctionOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FunctionOutlinedIconType: String = js.native
  }
  
  type _To = FunctionOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFunctionOutlinedMod.foo` */
  override def _to: FunctionOutlinedIconType = default
}
