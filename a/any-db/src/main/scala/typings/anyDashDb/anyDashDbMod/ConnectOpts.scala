package typings.anyDashDb.anyDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOpts extends js.Object {
  var adapter: String
}

object ConnectOpts {
  @scala.inline
  def apply(adapter: String): ConnectOpts = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConnectOpts]
  }
}

