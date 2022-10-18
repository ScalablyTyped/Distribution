package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPieChartOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PieChartOutlined", JSImport.Default)
  @js.native
  val default: PieChartOutlinedIconType = js.native
  
  @js.native
  trait PieChartOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_PieChartOutlinedIconType: String = js.native
  }
  
  type _To = PieChartOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPieChartOutlinedMod.foo` */
  override def _to: PieChartOutlinedIconType = default
}
