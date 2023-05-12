package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEuroTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EuroTwoTone", JSImport.Default)
  @js.native
  val default: EuroTwoToneIconType = js.native
  
  @js.native
  trait EuroTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_EuroTwoToneIconType: String = js.native
  }
  
  type _To = EuroTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEuroTwoToneMod.foo` */
  override def _to: EuroTwoToneIconType = default
}
