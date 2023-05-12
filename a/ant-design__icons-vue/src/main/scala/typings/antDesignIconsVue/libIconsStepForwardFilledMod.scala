package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsStepForwardFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/StepForwardFilled", JSImport.Default)
  @js.native
  val default: StepForwardFilledIconType = js.native
  
  @js.native
  trait StepForwardFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_StepForwardFilledIconType: String = js.native
  }
  
  type _To = StepForwardFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsStepForwardFilledMod.foo` */
  override def _to: StepForwardFilledIconType = default
}
