package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import typings.alipayjssdk.AlipayJSSDK.IAnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteData extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 要写入的数据，每个 key/value 的组合为一个数据项 */
  var data: IAnyObject
}
object CompleteData {
  
  inline def apply(data: IAnyObject): CompleteData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteData]
  }
  
  extension [Self <: CompleteData](x: Self) {
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setData(value: IAnyObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
