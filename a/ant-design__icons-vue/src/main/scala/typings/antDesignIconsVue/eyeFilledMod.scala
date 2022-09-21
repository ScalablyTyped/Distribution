package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eyeFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EyeFilled", JSImport.Default)
  @js.native
  val default: EyeFilledIconType = js.native
  
  @js.native
  trait EyeFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_EyeFilledIconType: String = js.native
  }
  
  type _To = EyeFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `eyeFilledMod.foo` */
  override def _to: EyeFilledIconType = default
}
