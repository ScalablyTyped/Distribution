package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsEnvironmentTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/EnvironmentTwoTone", JSImport.Default)
  @js.native
  val default: EnvironmentTwoToneIconType = js.native
  
  @js.native
  trait EnvironmentTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_EnvironmentTwoToneIconType: String = js.native
  }
  
  type _To = EnvironmentTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsEnvironmentTwoToneMod.foo` */
  override def _to: EnvironmentTwoToneIconType = default
}
