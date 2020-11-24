package typings.aliApp.my

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App
  extends /* key */ StringDictionary[js.Any] {
  
  var data: js.Any = js.native
  
  /**
    * 获取当前页面
    */
  def getCurrentPage(): Page = js.native
}
object App {
  
  @scala.inline
  def apply(data: js.Any, getCurrentPage: () => Page): App = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getCurrentPage = js.Any.fromFunction0(getCurrentPage))
    __obj.asInstanceOf[App]
  }
  
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentPage(value: () => Page): Self = this.set("getCurrentPage", js.Any.fromFunction0(value))
  }
}
