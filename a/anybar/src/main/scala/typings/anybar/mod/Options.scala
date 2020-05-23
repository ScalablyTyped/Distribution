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
  def apply(port: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

