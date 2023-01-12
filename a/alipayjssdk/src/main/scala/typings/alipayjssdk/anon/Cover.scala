package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cover extends StObject {
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** 封面 URL */
  var cover: js.UndefOr[String] = js.undefined
  
  /** 音乐描述 */
  var describe: js.UndefOr[String] = js.undefined
  
  /** logo URL */
  var logo: js.UndefOr[String] = js.undefined
  
  /** 演唱者 */
  var singer: js.UndefOr[String] = js.undefined
  
  /** 音乐标题 */
  var title: js.UndefOr[String] = js.undefined
  
  /** 音乐链接地址 */
  var url: String
}
object Cover {
  
  inline def apply(url: String): Cover = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cover] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCover(value: String): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
    
    inline def setDescribe(value: String): Self = StObject.set(x, "describe", value.asInstanceOf[js.Any])
    
    inline def setDescribeUndefined: Self = StObject.set(x, "describe", js.undefined)
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setLogoUndefined: Self = StObject.set(x, "logo", js.undefined)
    
    inline def setSinger(value: String): Self = StObject.set(x, "singer", value.asInstanceOf[js.Any])
    
    inline def setSingerUndefined: Self = StObject.set(x, "singer", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
