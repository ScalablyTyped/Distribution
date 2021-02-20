package typings.atlassianConnectJs.anon

import typings.std.Date
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<atlassian-connect-js.AP.jira.DatePickerOptions> */
@js.native
trait PartialDatePickerOptions extends StObject {
  
  var date: js.UndefOr[String] = js.native
  
  var element: js.UndefOr[HTMLElement] = js.native
  
  var onSelect: js.UndefOr[js.Function2[/* isoDate */ String, /* date */ Date, Unit]] = js.native
  
  var position: js.UndefOr[Left] = js.native
  
  var showTime: js.UndefOr[Boolean] = js.native
}
object PartialDatePickerOptions {
  
  @scala.inline
  def apply(): PartialDatePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialDatePickerOptions]
  }
  
  @scala.inline
  implicit class PartialDatePickerOptionsMutableBuilder[Self <: PartialDatePickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setOnSelect(value: (/* isoDate */ String, /* date */ Date) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setPosition(value: Left): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setShowTime(value: Boolean): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowTimeUndefined: Self = StObject.set(x, "showTime", js.undefined)
  }
}
