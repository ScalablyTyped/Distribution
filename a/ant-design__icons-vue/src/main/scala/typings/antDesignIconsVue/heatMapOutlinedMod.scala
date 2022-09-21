package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatMapOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HeatMapOutlined", JSImport.Default)
  @js.native
  val default: HeatMapOutlinedIconType = js.native
  
  @js.native
  trait HeatMapOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_HeatMapOutlinedIconType: String = js.native
  }
  
  type _To = HeatMapOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `heatMapOutlinedMod.foo` */
  override def _to: HeatMapOutlinedIconType = default
}
