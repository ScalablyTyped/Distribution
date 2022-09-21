package typings.aliApp.my

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait App
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var data: Any
  
  /**
    * 获取当前页面
    */
  def getCurrentPage(): Page
}
object App {
  
  inline def apply(data: Any, getCurrentPage: () => Page): App = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getCurrentPage = js.Any.fromFunction0(getCurrentPage))
    __obj.asInstanceOf[App]
  }
  
  extension [Self <: App](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentPage(value: () => Page): Self = StObject.set(x, "getCurrentPage", js.Any.fromFunction0(value))
  }
}
