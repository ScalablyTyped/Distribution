package typings.arangodb.headerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderTransportOptions extends js.Object {
  var name: js.UndefOr[String] = js.undefined
}

object HeaderTransportOptions {
  @scala.inline
  def apply(name: String = null): HeaderTransportOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderTransportOptions]
  }
}

