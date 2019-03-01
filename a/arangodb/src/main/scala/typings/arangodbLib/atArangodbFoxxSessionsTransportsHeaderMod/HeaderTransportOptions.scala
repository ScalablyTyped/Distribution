package typings
package arangodbLib.atArangodbFoxxSessionsTransportsHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderTransportOptions extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object HeaderTransportOptions {
  @scala.inline
  def apply(name: java.lang.String = null): HeaderTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[HeaderTransportOptions]
  }
}

