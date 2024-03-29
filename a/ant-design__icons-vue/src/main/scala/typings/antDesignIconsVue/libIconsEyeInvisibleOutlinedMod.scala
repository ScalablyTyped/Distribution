package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEyeInvisibleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EyeInvisibleOutlined", JSImport.Default)
  @js.native
  val default: EyeInvisibleOutlinedIconType = js.native
  
  @js.native
  trait EyeInvisibleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_EyeInvisibleOutlinedIconType: String = js.native
  }
  
  type _To = EyeInvisibleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEyeInvisibleOutlinedMod.foo` */
  override def _to: EyeInvisibleOutlinedIconType = default
}
