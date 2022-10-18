package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPieChartTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PieChartTwoTone", JSImport.Default)
  @js.native
  val default: PieChartTwoToneIconType = js.native
  
  @js.native
  trait PieChartTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PieChartTwoToneIconType: String = js.native
  }
  
  type _To = PieChartTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPieChartTwoToneMod.foo` */
  override def _to: PieChartTwoToneIconType = default
}
