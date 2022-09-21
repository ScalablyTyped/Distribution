package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxPlotTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BoxPlotTwoTone", JSImport.Default)
  @js.native
  val default: BoxPlotTwoToneIconType = js.native
  
  @js.native
  trait BoxPlotTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_BoxPlotTwoToneIconType: String = js.native
  }
  
  type _To = BoxPlotTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `boxPlotTwoToneMod.foo` */
  override def _to: BoxPlotTwoToneIconType = default
}
