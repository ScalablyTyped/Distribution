package typings.aliApp.anon

import typings.aliApp.aliAppNumbers.`11`
import typings.aliApp.aliAppStrings.HHColonmm
import typings.aliApp.aliAppStrings.`yyyy-MM-dd HHColonmm`
import typings.aliApp.aliAppStrings.`yyyy-MM-dd`
import typings.aliApp.aliAppStrings.`yyyy-MM`
import typings.aliApp.aliAppStrings.yyyy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ali-app.my.DatePickerOptions> */
@js.native
trait PartialDatePickerOptions extends StObject {
  
  var complete: js.UndefOr[js.Function1[/* res */ js.Any, Unit]] = js.native
  
  var currentDate: js.UndefOr[String] = js.native
  
  var endDate: js.UndefOr[String] = js.native
  
  var fail: js.UndefOr[js.Function1[`11`, Unit]] = js.native
  
  var format: js.UndefOr[`yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy] = js.native
  
  var startDate: js.UndefOr[String] = js.native
  
  var success: js.UndefOr[js.Function1[/* result */ Date, Unit]] = js.native
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
    def setComplete(value: /* res */ js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCurrentDate(value: String): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    @scala.inline
    def setFail(value: `11` => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFormat(value: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ Date => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
