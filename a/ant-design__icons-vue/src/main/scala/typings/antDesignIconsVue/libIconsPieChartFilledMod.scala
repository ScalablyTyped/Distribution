package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsPieChartFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/PieChartFilled", JSImport.Default)
  @js.native
  val default: PieChartFilledIconType = js.native
  
  @js.native
  trait PieChartFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_PieChartFilledIconType: String = js.native
  }
  
  type _To = PieChartFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsPieChartFilledMod.foo` */
  override def _to: PieChartFilledIconType = default
}
