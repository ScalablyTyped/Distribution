package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEuroOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EuroOutlined", JSImport.Default)
  @js.native
  val default: EuroOutlinedIconType = js.native
  
  @js.native
  trait EuroOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_EuroOutlinedIconType: String = js.native
  }
  
  type _To = EuroOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEuroOutlinedMod.foo` */
  override def _to: EuroOutlinedIconType = default
}
