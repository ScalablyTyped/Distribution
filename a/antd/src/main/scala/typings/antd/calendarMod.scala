package typings.antd

import typings.antd.generateCalendarMod.CalendarProps
import typings.moment.mod.Moment
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  @JSImport("antd/lib/calendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: CalendarProps[Moment]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
