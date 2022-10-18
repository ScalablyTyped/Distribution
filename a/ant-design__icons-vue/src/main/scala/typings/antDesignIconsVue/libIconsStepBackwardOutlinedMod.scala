package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsStepBackwardOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/StepBackwardOutlined", JSImport.Default)
  @js.native
  val default: StepBackwardOutlinedIconType = js.native
  
  @js.native
  trait StepBackwardOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_StepBackwardOutlinedIconType: String = js.native
  }
  
  type _To = StepBackwardOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsStepBackwardOutlinedMod.foo` */
  override def _to: StepBackwardOutlinedIconType = default
}
