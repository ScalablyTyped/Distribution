package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsHeatMapOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/HeatMapOutlined", JSImport.Default)
  @js.native
  val default: HeatMapOutlinedIconType = js.native
  
  @js.native
  trait HeatMapOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_HeatMapOutlinedIconType: String = js.native
  }
  
  type _To = HeatMapOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsHeatMapOutlinedMod.foo` */
  override def _to: HeatMapOutlinedIconType = default
}
