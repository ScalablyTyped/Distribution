package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFunnelPlotTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FunnelPlotTwoTone", JSImport.Default)
  @js.native
  val default: FunnelPlotTwoToneIconType = js.native
  
  @js.native
  trait FunnelPlotTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FunnelPlotTwoToneIconType: String = js.native
  }
  
  type _To = FunnelPlotTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFunnelPlotTwoToneMod.foo` */
  override def _to: FunnelPlotTwoToneIconType = default
}
