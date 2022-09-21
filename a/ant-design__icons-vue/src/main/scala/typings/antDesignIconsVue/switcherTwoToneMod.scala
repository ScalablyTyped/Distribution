package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object switcherTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/SwitcherTwoTone", JSImport.Default)
  @js.native
  val default: SwitcherTwoToneIconType = js.native
  
  @js.native
  trait SwitcherTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_SwitcherTwoToneIconType: String = js.native
  }
  
  type _To = SwitcherTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `switcherTwoToneMod.foo` */
  override def _to: SwitcherTwoToneIconType = default
}
