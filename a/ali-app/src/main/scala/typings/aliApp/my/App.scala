package typings.aliApp.my

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait App
  extends /* key */ StringDictionary[js.Any] {
  var data: js.Any
  /**
    * 获取当前页面
    */
  def getCurrentPage(): Page
}

object App {
  @scala.inline
  def apply(
    data: js.Any,
    getCurrentPage: () => Page,
    StringDictionary: /* name */ StringDictionary[js.Any] = null
  ): App = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], getCurrentPage = js.Any.fromFunction0(getCurrentPage))
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[App]
  }
}

