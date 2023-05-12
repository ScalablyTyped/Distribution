package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPhoneTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PhoneTwoTone", JSImport.Default)
  @js.native
  val default: PhoneTwoToneIconType = js.native
  
  @js.native
  trait PhoneTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PhoneTwoToneIconType: String = js.native
  }
  
  type _To = PhoneTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPhoneTwoToneMod.foo` */
  override def _to: PhoneTwoToneIconType = default
}
