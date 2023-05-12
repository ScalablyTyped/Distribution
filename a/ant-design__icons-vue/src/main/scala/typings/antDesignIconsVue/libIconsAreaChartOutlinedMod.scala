package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsAreaChartOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/AreaChartOutlined", JSImport.Default)
  @js.native
  val default: AreaChartOutlinedIconType = js.native
  
  @js.native
  trait AreaChartOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_AreaChartOutlinedIconType: String = js.native
  }
  
  type _To = AreaChartOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsAreaChartOutlinedMod.foo` */
  override def _to: AreaChartOutlinedIconType = default
}
