package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsBoxPlotTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/BoxPlotTwoTone", JSImport.Default)
  @js.native
  val default: BoxPlotTwoToneIconType = js.native
  
  @js.native
  trait BoxPlotTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_BoxPlotTwoToneIconType: String = js.native
  }
  
  type _To = BoxPlotTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsBoxPlotTwoToneMod.foo` */
  override def _to: BoxPlotTwoToneIconType = default
}
