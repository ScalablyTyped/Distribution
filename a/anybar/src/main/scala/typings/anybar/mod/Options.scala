package typings.anybar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Port to communicate with the AnyBar.app.
  		@default 1738
  		*/
  var port: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(port: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

