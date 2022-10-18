package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEuroCircleTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EuroCircleTwoTone", JSImport.Default)
  @js.native
  val default: EuroCircleTwoToneIconType = js.native
  
  @js.native
  trait EuroCircleTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_EuroCircleTwoToneIconType: String = js.native
  }
  
  type _To = EuroCircleTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEuroCircleTwoToneMod.foo` */
  override def _to: EuroCircleTwoToneIconType = default
}
