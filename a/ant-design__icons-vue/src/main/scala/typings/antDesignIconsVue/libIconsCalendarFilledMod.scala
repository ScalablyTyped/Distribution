package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.libComponentsAntdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIconsCalendarFilledMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CalendarFilled", JSImport.Default)
  @js.native
  val default: CalendarFilledIconType = js.native
  
  @js.native
  trait CalendarFilledIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object, Any] {
    
    @JSName("displayName")
    var displayName_CalendarFilledIconType: String = js.native
  }
  
  type _To = CalendarFilledIconType
  
  /* This means you don't have to write `default`, but can instead just say `libIconsCalendarFilledMod.foo` */
  override def _to: CalendarFilledIconType = default
}
