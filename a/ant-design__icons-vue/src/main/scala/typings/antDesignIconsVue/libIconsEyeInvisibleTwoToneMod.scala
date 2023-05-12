package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEyeInvisibleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EyeInvisibleTwoTone", JSImport.Default)
  @js.native
  val default: EyeInvisibleTwoToneIconType = js.native
  
  @js.native
  trait EyeInvisibleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_EyeInvisibleTwoToneIconType: String = js.native
  }
  
  type _To = EyeInvisibleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEyeInvisibleTwoToneMod.foo` */
  override def _to: EyeInvisibleTwoToneIconType = default
}
