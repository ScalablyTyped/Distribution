package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsHourglassOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HourglassOutlined", JSImport.Default)
  @js.native
  val default: HourglassOutlinedIconType = js.native
  
  @js.native
  trait HourglassOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_HourglassOutlinedIconType: String = js.native
  }
  
  type _To = HourglassOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsHourglassOutlinedMod.foo` */
  override def _to: HourglassOutlinedIconType = default
}
