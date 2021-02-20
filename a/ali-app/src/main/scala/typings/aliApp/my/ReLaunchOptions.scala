package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReLaunchOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /**
    * 需要跳转的应用内页面路径 , 路径后可以带参数。
    * 参数与路径之间使用?分隔，参数键与参数值用=相连，不同参数用&分隔
    * 如 'path?key=value&key2=value2'，如果跳转的页面路径是 tabBar 页面则不能带参数
    */
  var url: String = js.native
}
object ReLaunchOptions {
  
  @scala.inline
  def apply(url: String): ReLaunchOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReLaunchOptions]
  }
  
  @scala.inline
  implicit class ReLaunchOptionsMutableBuilder[Self <: ReLaunchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
