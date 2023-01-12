package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.IAnyObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataIAnyObject extends StObject {
  
  /** 通过 popWindow/popTo 传递的 data 参数 */
  var data: IAnyObject
}
object DataIAnyObject {
  
  inline def apply(data: IAnyObject): DataIAnyObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataIAnyObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataIAnyObject] (val x: Self) extends AnyVal {
    
    inline def setData(value: IAnyObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
