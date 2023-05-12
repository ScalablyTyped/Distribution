package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsScheduleOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ScheduleOutlined", JSImport.Default)
  @js.native
  val default: ScheduleOutlinedIconType = js.native
  
  @js.native
  trait ScheduleOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_ScheduleOutlinedIconType: String = js.native
  }
  
  type _To = ScheduleOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsScheduleOutlinedMod.foo` */
  override def _to: ScheduleOutlinedIconType = default
}
