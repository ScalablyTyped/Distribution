package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region TabBar https://docs.alipay.com/mini/api/ui-tabbar
trait SwitchTabOptions
  extends StObject
     with BaseOptions[js.Any, js.Any] {
  
  /**
    * 需要跳转的 tabBar 页面的路径
    * （需在 app.json 的 tabBar 字段定义的页面），路径后不能带参数
    */
  var url: String
}
object SwitchTabOptions {
  
  inline def apply(url: String): SwitchTabOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwitchTabOptions]
  }
  
  extension [Self <: SwitchTabOptions](x: Self) {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
