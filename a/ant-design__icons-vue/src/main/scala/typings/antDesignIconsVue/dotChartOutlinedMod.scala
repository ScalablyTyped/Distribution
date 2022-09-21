package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dotChartOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DotChartOutlined", JSImport.Default)
  @js.native
  val default: DotChartOutlinedIconType = js.native
  
  @js.native
  trait DotChartOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DotChartOutlinedIconType: String = js.native
  }
  
  type _To = DotChartOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `dotChartOutlinedMod.foo` */
  override def _to: DotChartOutlinedIconType = default
}
