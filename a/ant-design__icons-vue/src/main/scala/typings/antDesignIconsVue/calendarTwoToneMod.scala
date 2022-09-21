package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsVue.antdIconMod.AntdIconProps
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarTwoToneMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/icons/CalendarTwoTone", JSImport.Default)
  @js.native
  val default: CalendarTwoToneIconType = js.native
  
  @js.native
  trait CalendarTwoToneIconType
    extends StObject
       with FunctionalComponent[AntdIconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_CalendarTwoToneIconType: String = js.native
  }
  
  type _To = CalendarTwoToneIconType
  
  /* This means you don't have to write `default`, but can instead just say `calendarTwoToneMod.foo` */
  override def _to: CalendarTwoToneIconType = default
}
