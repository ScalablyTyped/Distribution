package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarOutlinedMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CalendarOutlined", JSImport.Default)
  @js.native
  val default: CalendarOutlinedIconType = js.native
  
  @js.native
  trait CalendarOutlinedIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CalendarOutlinedIconType: String = js.native
  }
  
  type _To = CalendarOutlinedIconType
  
  /* This means you don't have to write `default`, but can instead just say `calendarOutlinedMod.foo` */
  override def _to: CalendarOutlinedIconType = default
}
