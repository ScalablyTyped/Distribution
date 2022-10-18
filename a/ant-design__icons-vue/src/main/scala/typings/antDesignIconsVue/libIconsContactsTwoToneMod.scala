package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsContactsTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ContactsTwoTone", JSImport.Default)
  @js.native
  val default: ContactsTwoToneIconType = js.native
  
  @js.native
  trait ContactsTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ContactsTwoToneIconType: String = js.native
  }
  
  type _To = ContactsTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsContactsTwoToneMod.foo` */
  override def _to: ContactsTwoToneIconType = default
}
