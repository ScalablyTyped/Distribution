package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsDashboardOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/DashboardOutlined", JSImport.Default)
  @js.native
  val default: DashboardOutlinedIconType = js.native
  
  @js.native
  trait DashboardOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_DashboardOutlinedIconType: String = js.native
  }
  
  type _To = DashboardOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsDashboardOutlinedMod.foo` */
  override def _to: DashboardOutlinedIconType = default
}
