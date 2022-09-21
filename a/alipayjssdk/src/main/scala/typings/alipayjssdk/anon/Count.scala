package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import typings.alipayjssdk.alipayjssdkStrings.album
import typings.alipayjssdk.alipayjssdkStrings.camera
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 最大可选照片数，默认1张，上限9张 */
  var count: js.UndefOr[Double] = js.undefined
  
  /** 相册选取或者拍照，默认 ['camera', 'album'] */
  var sourceType: js.UndefOr[js.Array[camera | album]] = js.undefined
}
object Count {
  
  inline def apply(): Count = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setSourceType(value: js.Array[camera | album]): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setSourceTypeVarargs(value: (camera | album)*): Self = StObject.set(x, "sourceType", js.Array(value*))
  }
}
