package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineChartOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/LineChartOutlined", JSImport.Default)
  @js.native
  val default: LineChartOutlinedIconType = js.native
  
  @js.native
  trait LineChartOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_LineChartOutlinedIconType: String = js.native
  }
  
  type _To = LineChartOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `lineChartOutlinedMod.foo` */
  override def _to: LineChartOutlinedIconType = default
}
