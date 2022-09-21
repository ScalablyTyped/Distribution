package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object barChartOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BarChartOutlined", JSImport.Default)
  @js.native
  val default: BarChartOutlinedIconType = js.native
  
  @js.native
  trait BarChartOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BarChartOutlinedIconType: String = js.native
  }
  
  type _To = BarChartOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `barChartOutlinedMod.foo` */
  override def _to: BarChartOutlinedIconType = default
}
