package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Available extends js.Object {
  /**
  			 * 服务目前是否可用
  			 */
  var available: scala.Boolean
  /**
  			 * 目前是否处于搜索状态
  			 */
  var discovering: scala.Boolean
}

object Anon_Available {
  @scala.inline
  def apply(available: scala.Boolean, discovering: scala.Boolean): Anon_Available = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("available")(available)
    __obj.updateDynamic("discovering")(discovering)
    __obj.asInstanceOf[Anon_Available]
  }
}

