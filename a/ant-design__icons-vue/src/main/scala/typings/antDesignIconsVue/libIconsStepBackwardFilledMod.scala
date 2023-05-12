package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsStepBackwardFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/StepBackwardFilled", JSImport.Default)
  @js.native
  val default: StepBackwardFilledIconType = js.native
  
  @js.native
  trait StepBackwardFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_StepBackwardFilledIconType: String = js.native
  }
  
  type _To = StepBackwardFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsStepBackwardFilledMod.foo` */
  override def _to: StepBackwardFilledIconType = default
}
