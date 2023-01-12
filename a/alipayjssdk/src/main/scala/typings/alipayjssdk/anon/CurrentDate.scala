package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentDate extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 初始选择的日期时间，默认当前时间 */
  var currentDate: js.UndefOr[String] = js.undefined
  
  /** 最大日期时间 */
  var endDate: js.UndefOr[String] = js.undefined
  
  /** 返回的日期格式，默认 yyyy-MM-dd。支持 HH:mm:ss, yyyy-MM-dd, yyyy-MM-dd HH:mm:ss 三种格式 */
  var formate: js.UndefOr[String] = js.undefined
  
  /** 最小日期时间 */
  var startDate: js.UndefOr[String] = js.undefined
}
object CurrentDate {
  
  inline def apply(): CurrentDate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentDate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentDate] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCurrentDate(value: String): Self = StObject.set(x, "currentDate", value.asInstanceOf[js.Any])
    
    inline def setCurrentDateUndefined: Self = StObject.set(x, "currentDate", js.undefined)
    
    inline def setEndDate(value: String): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
    
    inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
    
    inline def setFormate(value: String): Self = StObject.set(x, "formate", value.asInstanceOf[js.Any])
    
    inline def setFormateUndefined: Self = StObject.set(x, "formate", js.undefined)
    
    inline def setStartDate(value: String): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
    
    inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
  }
}
