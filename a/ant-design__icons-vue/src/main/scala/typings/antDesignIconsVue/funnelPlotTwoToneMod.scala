package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object funnelPlotTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FunnelPlotTwoTone", JSImport.Default)
  @js.native
  val default: FunnelPlotTwoToneIconType = js.native
  
  @js.native
  trait FunnelPlotTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_FunnelPlotTwoToneIconType: String = js.native
  }
  
  type _To = FunnelPlotTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `funnelPlotTwoToneMod.foo` */
  override def _to: FunnelPlotTwoToneIconType = default
}
