package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsRadarChartOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/RadarChartOutlined", JSImport.Default)
  @js.native
  val default: RadarChartOutlinedIconType = js.native
  
  @js.native
  trait RadarChartOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_RadarChartOutlinedIconType: String = js.native
  }
  
  type _To = RadarChartOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsRadarChartOutlinedMod.foo` */
  override def _to: RadarChartOutlinedIconType = default
}
