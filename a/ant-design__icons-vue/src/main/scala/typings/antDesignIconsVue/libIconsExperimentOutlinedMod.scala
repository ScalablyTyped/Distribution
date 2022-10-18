package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsExperimentOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ExperimentOutlined", JSImport.Default)
  @js.native
  val default: ExperimentOutlinedIconType = js.native
  
  @js.native
  trait ExperimentOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ExperimentOutlinedIconType: String = js.native
  }
  
  type _To = ExperimentOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsExperimentOutlinedMod.foo` */
  override def _to: ExperimentOutlinedIconType = default
}
