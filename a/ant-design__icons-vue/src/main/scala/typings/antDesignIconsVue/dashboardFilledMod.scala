package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dashboardFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DashboardFilled", JSImport.Default)
  @js.native
  val default: DashboardFilledIconType = js.native
  
  @js.native
  trait DashboardFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DashboardFilledIconType: String = js.native
  }
  
  type _To = DashboardFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `dashboardFilledMod.foo` */
  override def _to: DashboardFilledIconType = default
}
