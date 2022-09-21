package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dashboardTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DashboardTwoTone", JSImport.Default)
  @js.native
  val default: DashboardTwoToneIconType = js.native
  
  @js.native
  trait DashboardTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DashboardTwoToneIconType: String = js.native
  }
  
  type _To = DashboardTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `dashboardTwoToneMod.foo` */
  override def _to: DashboardTwoToneIconType = default
}
