package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsExperimentFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ExperimentFilled", JSImport.Default)
  @js.native
  val default: ExperimentFilledIconType = js.native
  
  @js.native
  trait ExperimentFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ExperimentFilledIconType: String = js.native
  }
  
  type _To = ExperimentFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsExperimentFilledMod.foo` */
  override def _to: ExperimentFilledIconType = default
}
