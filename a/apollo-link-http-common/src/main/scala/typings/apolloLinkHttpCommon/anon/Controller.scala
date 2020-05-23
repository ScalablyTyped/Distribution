package typings.apolloLinkHttpCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Controller extends js.Object {
  var controller: js.Any
  var signal: js.Any
}

object Controller {
  @scala.inline
  def apply(controller: js.Any, signal: js.Any): Controller = {
    val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Controller]
  }
}

