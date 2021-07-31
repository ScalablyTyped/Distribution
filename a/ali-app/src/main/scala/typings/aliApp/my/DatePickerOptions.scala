package typings.aliApp.my

import typings.aliApp.aliAppNumbers.`11`
import typings.aliApp.aliAppStrings.HHColonmm
import typings.aliApp.aliAppStrings.`yyyy-MM-dd HHColonmm`
import typings.aliApp.aliAppStrings.`yyyy-MM-dd`
import typings.aliApp.aliAppStrings.`yyyy-MM`
import typings.aliApp.aliAppStrings.yyyy
import typings.aliApp.anon.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region 选择日期 https://docs.alipay.com/mini/api/ui-date
trait DatePickerOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /** 初始选择的日期时间，默认当前时间 */
  var currentDate: String
  
  /** 最大日期时间 */
  var endDate: String
  
  /** 11 用户取消操作 */
  @JSName("fail")
  def fail_11(error: `11`): Unit
  
  /**
    * 返回的日期格式，
    * 1. yyyy-MM-dd（默认）
    * 2. HH:mm
    * 3. yyyy-MM-dd HH:mm
    * 4. yyyy-MM （最低基础库：1.1.1, 可用 canIUse('datePicker.object.format.yyyy-MM') 判断）
    * 5. yyyy （最低基础库：1.1.1,可用 canIUse('datePicker.object.format.yyyy') 判断）
    */
  var format: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy
  
  /** 最小日期时间 */
  var startDate: String
  
  @JSName("success")
  def success_MDatePickerOptions(result: Date): Unit
}
object DatePickerOptions {
  
  @scala.inline
  def apply(
    currentDate: String,
    endDate: String,
    fail: `11` => Unit,
    format: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy,
    startDate: String,
    success: Date => Unit
  ): DatePickerOptions = {
    val __obj = js.Dynamic.literal(currentDate = currentDate.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], fail = js.Any.fromFunction1(fail), format = format.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[DatePickerOptions]
  }
  
  @scala.inline
  implicit class DatePickerOptionsMutableBuilder[Self <: DatePickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentDate(value: String): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFail(value: `11` => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFormat(value: `yyyy-MM-dd` | HHColonmm | (`yyyy-MM-dd HHColonmm`) | `yyyy-MM` | yyyy): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Date => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
