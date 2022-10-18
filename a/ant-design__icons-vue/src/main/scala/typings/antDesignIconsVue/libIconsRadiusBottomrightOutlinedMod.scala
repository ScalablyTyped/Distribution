package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRadiusBottomrightOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RadiusBottomrightOutlined", JSImport.Default)
  @js.native
  val default: RadiusBottomrightOutlinedIconType = js.native
  
  @js.native
  trait RadiusBottomrightOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RadiusBottomrightOutlinedIconType: String = js.native
  }
  
  type _To = RadiusBottomrightOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRadiusBottomrightOutlinedMod.foo` */
  override def _to: RadiusBottomrightOutlinedIconType = default
}
