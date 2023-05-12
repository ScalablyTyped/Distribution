package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsSafetyOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SafetyOutlined", JSImport.Default)
  @js.native
  val default: SafetyOutlinedIconType = js.native
  
  @js.native
  trait SafetyOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_SafetyOutlinedIconType: String = js.native
  }
  
  type _To = SafetyOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsSafetyOutlinedMod.foo` */
  override def _to: SafetyOutlinedIconType = default
}
