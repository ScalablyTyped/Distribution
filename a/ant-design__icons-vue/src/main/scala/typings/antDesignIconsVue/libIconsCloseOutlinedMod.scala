package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCloseOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CloseOutlined", JSImport.Default)
  @js.native
  val default: CloseOutlinedIconType = js.native
  
  @js.native
  trait CloseOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CloseOutlinedIconType: String = js.native
  }
  
  type _To = CloseOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCloseOutlinedMod.foo` */
  override def _to: CloseOutlinedIconType = default
}
