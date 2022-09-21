package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxPlotOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BoxPlotOutlined", JSImport.Default)
  @js.native
  val default: BoxPlotOutlinedIconType = js.native
  
  @js.native
  trait BoxPlotOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BoxPlotOutlinedIconType: String = js.native
  }
  
  type _To = BoxPlotOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `boxPlotOutlinedMod.foo` */
  override def _to: BoxPlotOutlinedIconType = default
}
