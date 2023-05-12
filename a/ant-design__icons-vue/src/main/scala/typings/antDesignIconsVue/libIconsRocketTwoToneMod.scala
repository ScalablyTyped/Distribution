package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRocketTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RocketTwoTone", JSImport.Default)
  @js.native
  val default: RocketTwoToneIconType = js.native
  
  @js.native
  trait RocketTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_RocketTwoToneIconType: String = js.native
  }
  
  type _To = RocketTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRocketTwoToneMod.foo` */
  override def _to: RocketTwoToneIconType = default
}
