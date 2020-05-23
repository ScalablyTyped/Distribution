package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Available extends js.Object {
  /**
    * 服务目前是否可用
    */
  var available: Boolean
  /**
    * 目前是否处于搜索状态
    */
  var discovering: Boolean
}

object Available {
  @scala.inline
  def apply(available: Boolean, discovering: Boolean): Available = {
    val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], discovering = discovering.asInstanceOf[js.Any])
    __obj.asInstanceOf[Available]
  }
}

