package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsHourglassFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HourglassFilled", JSImport.Default)
  @js.native
  val default: HourglassFilledIconType = js.native
  
  @js.native
  trait HourglassFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_HourglassFilledIconType: String = js.native
  }
  
  type _To = HourglassFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsHourglassFilledMod.foo` */
  override def _to: HourglassFilledIconType = default
}
