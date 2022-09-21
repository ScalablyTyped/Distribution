package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 按钮数组，数组中每个项是一个对象 */
  var items: js.Array[Badge]
  
  /** 监听 optionButton 点击事件 */
  var onClick: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  
  /** 是否阻止默认的分享功能，指定 iconType 的情况下点击时，会弹分享面板，`preventDefault: true` 会阻止默认分享面板弹出 */
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  
  /** 重置到系统默认按钮，默认为 false。当为 true 时，忽略其他参数 */
  var reset: js.UndefOr[Boolean] = js.undefined
}
object OnClick {
  
  inline def apply(items: js.Array[Badge]): OnClick = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClick]
  }
  
  extension [Self <: OnClick](x: Self) {
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setItems(value: js.Array[Badge]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Badge*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOnClick(value: /* index */ Double => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
  }
}
