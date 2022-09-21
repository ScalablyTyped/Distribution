package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scheduleFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/ScheduleFilled", JSImport.Default)
  @js.native
  val default: ScheduleFilledIconType = js.native
  
  @js.native
  trait ScheduleFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_ScheduleFilledIconType: String = js.native
  }
  
  type _To = ScheduleFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `scheduleFilledMod.foo` */
  override def _to: ScheduleFilledIconType = default
}
