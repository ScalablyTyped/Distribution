package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsFunnelPlotFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/FunnelPlotFilled", JSImport.Default)
  @js.native
  val default: FunnelPlotFilledIconType = js.native
  
  @js.native
  trait FunnelPlotFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_FunnelPlotFilledIconType: String = js.native
  }
  
  type _To = FunnelPlotFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsFunnelPlotFilledMod.foo` */
  override def _to: FunnelPlotFilledIconType = default
}
