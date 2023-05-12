package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsHourglassTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HourglassTwoTone", JSImport.Default)
  @js.native
  val default: HourglassTwoToneIconType = js.native
  
  @js.native
  trait HourglassTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_HourglassTwoToneIconType: String = js.native
  }
  
  type _To = HourglassTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsHourglassTwoToneMod.foo` */
  override def _to: HourglassTwoToneIconType = default
}
