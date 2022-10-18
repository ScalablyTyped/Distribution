package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsStopTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/StopTwoTone", JSImport.Default)
  @js.native
  val default: StopTwoToneIconType = js.native
  
  @js.native
  trait StopTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_StopTwoToneIconType: String = js.native
  }
  
  type _To = StopTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsStopTwoToneMod.foo` */
  override def _to: StopTwoToneIconType = default
}
