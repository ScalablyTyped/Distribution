package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteItems extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  var items: js.Array[Icon | String]
}
object CompleteItems {
  
  inline def apply(items: js.Array[Icon | String]): CompleteItems = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteItems]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompleteItems] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setItems(value: js.Array[Icon | String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: (Icon | String)*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
