package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFunnelPlotOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FunnelPlotOutlined", JSImport.Default)
  @js.native
  val default: FunnelPlotOutlinedIconType = js.native
  
  @js.native
  trait FunnelPlotOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FunnelPlotOutlinedIconType: String = js.native
  }
  
  type _To = FunnelPlotOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFunnelPlotOutlinedMod.foo` */
  override def _to: FunnelPlotOutlinedIconType = default
}
