package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsHtml5TwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/Html5TwoTone", JSImport.Default)
  @js.native
  val default: Html5TwoToneIconType = js.native
  
  @js.native
  trait Html5TwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_Html5TwoToneIconType: String = js.native
  }
  
  type _To = Html5TwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsHtml5TwoToneMod.foo` */
  override def _to: Html5TwoToneIconType = default
}
