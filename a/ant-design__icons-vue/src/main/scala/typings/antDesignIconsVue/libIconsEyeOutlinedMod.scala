package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEyeOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EyeOutlined", JSImport.Default)
  @js.native
  val default: EyeOutlinedIconType = js.native
  
  @js.native
  trait EyeOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_EyeOutlinedIconType: String = js.native
  }
  
  type _To = EyeOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEyeOutlinedMod.foo` */
  override def _to: EyeOutlinedIconType = default
}
