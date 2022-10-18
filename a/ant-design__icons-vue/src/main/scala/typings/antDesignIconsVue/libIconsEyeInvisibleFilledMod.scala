package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEyeInvisibleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EyeInvisibleFilled", JSImport.Default)
  @js.native
  val default: EyeInvisibleFilledIconType = js.native
  
  @js.native
  trait EyeInvisibleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_EyeInvisibleFilledIconType: String = js.native
  }
  
  type _To = EyeInvisibleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEyeInvisibleFilledMod.foo` */
  override def _to: EyeInvisibleFilledIconType = default
}
