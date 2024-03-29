package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsExperimentTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ExperimentTwoTone", JSImport.Default)
  @js.native
  val default: ExperimentTwoToneIconType = js.native
  
  @js.native
  trait ExperimentTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ExperimentTwoToneIconType: String = js.native
  }
  
  type _To = ExperimentTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsExperimentTwoToneMod.foo` */
  override def _to: ExperimentTwoToneIconType = default
}
