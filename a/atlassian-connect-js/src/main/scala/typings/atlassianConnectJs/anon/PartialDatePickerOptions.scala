package typings.atlassianConnectJs.anon

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<atlassian-connect-js.AP.jira.DatePickerOptions> */
trait PartialDatePickerOptions extends StObject {
  
  var date: js.UndefOr[String] = js.undefined
  
  var element: js.UndefOr[HTMLElement] = js.undefined
  
  var onSelect: js.UndefOr[js.Function2[/* isoDate */ String, /* date */ js.Date, Unit]] = js.undefined
  
  var position: js.UndefOr[Left] = js.undefined
  
  var showTime: js.UndefOr[Boolean] = js.undefined
}
object PartialDatePickerOptions {
  
  inline def apply(): PartialDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDatePickerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialDatePickerOptions] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setOnSelect(value: (/* isoDate */ String, /* date */ js.Date) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setPosition(value: Left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
    
    inline def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
  }
}
