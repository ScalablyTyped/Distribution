package typings.antdMobile

import typings.antdMobile.convertMod.Page
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarCalendarMod {
  
  @JSImport("antd-mobile/es/components/calendar/calendar", "Calendar")
  @js.native
  val Calendar: ForwardRefExoticComponent[CalendarProps & RefAttributes[CalendarRef]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.anon.selectionModeundefinedval
    - typings.antdMobile.anon.selectionModesinglevalueD
    - typings.antdMobile.anon.selectionModerangevalueDa
  */
  trait CalendarProps extends StObject
  object CalendarProps {
    
    inline def selectionModerangevalueDa(): typings.antdMobile.anon.selectionModerangevalueDa = {
      val __obj = js.Dynamic.literal(selectionMode = "range")
      __obj.asInstanceOf[typings.antdMobile.anon.selectionModerangevalueDa]
    }
    
    inline def selectionModesinglevalueD(): typings.antdMobile.anon.selectionModesinglevalueD = {
      val __obj = js.Dynamic.literal(selectionMode = "single")
      __obj.asInstanceOf[typings.antdMobile.anon.selectionModesinglevalueD]
    }
    
    inline def selectionModeundefinedval(defaultValue: Unit, onChange: Unit, selectionMode: Unit, value: Unit): typings.antdMobile.anon.selectionModeundefinedval = {
      val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.antdMobile.anon.selectionModeundefinedval]
    }
  }
  
  @js.native
  trait CalendarRef extends StObject {
    
    def jumpTo(page: js.Function1[/* page */ Page, Page]): Unit = js.native
    def jumpTo(page: Page): Unit = js.native
    
    def jumpToToday(): Unit = js.native
  }
}
