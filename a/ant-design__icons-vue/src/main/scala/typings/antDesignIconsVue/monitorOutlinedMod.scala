package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monitorOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/MonitorOutlined", JSImport.Default)
  @js.native
  val default: MonitorOutlinedIconType = js.native
  
  @js.native
  trait MonitorOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_MonitorOutlinedIconType: String = js.native
  }
  
  type _To = MonitorOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `monitorOutlinedMod.foo` */
  override def _to: MonitorOutlinedIconType = default
}
