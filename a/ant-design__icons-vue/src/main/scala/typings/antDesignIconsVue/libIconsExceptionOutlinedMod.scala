package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsExceptionOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ExceptionOutlined", JSImport.Default)
  @js.native
  val default: ExceptionOutlinedIconType = js.native
  
  @js.native
  trait ExceptionOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ExceptionOutlinedIconType: String = js.native
  }
  
  type _To = ExceptionOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsExceptionOutlinedMod.foo` */
  override def _to: ExceptionOutlinedIconType = default
}
