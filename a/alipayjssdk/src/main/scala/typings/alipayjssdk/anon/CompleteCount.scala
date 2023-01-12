package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteCount extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 单次最多选择联系人个数，默认 1，最大 10 */
  var count: js.UndefOr[Double] = js.undefined
}
object CompleteCount {
  
  inline def apply(): CompleteCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompleteCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompleteCount] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
