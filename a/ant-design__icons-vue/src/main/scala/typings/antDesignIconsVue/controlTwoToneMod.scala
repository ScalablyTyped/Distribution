package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object controlTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ControlTwoTone", JSImport.Default)
  @js.native
  val default: ControlTwoToneIconType = js.native
  
  @js.native
  trait ControlTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ControlTwoToneIconType: String = js.native
  }
  
  type _To = ControlTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `controlTwoToneMod.foo` */
  override def _to: ControlTwoToneIconType = default
}
