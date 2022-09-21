package typings.antdMobile

import org.scalablytyped.runtime.Shortcut
import typings.antdMobile.calendarCalendarMod.CalendarProps
import typings.antdMobile.calendarCalendarMod.CalendarRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod extends Shortcut {
  
  @JSImport("antd-mobile/es/components/calendar", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CalendarProps & RefAttributes[CalendarRef]] = js.native
  
  type _To = ForwardRefExoticComponent[CalendarProps & RefAttributes[CalendarRef]]
  
  /* This means you don't have to write `default`, but can instead just say `calendarMod.foo` */
  override def _to: ForwardRefExoticComponent[CalendarProps & RefAttributes[CalendarRef]] = default
}
