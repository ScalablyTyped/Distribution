package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import typings.alipayjssdk.alipayjssdkStrings.bar
import typings.alipayjssdk.alipayjssdkStrings.qr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 扫描目标类型，支持 qr / bar，相应扫码选框会不同，默认 qr */
  var `type`: qr | bar
}
object Type {
  
  inline def apply(`type`: qr | bar): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setType(value: qr | bar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
