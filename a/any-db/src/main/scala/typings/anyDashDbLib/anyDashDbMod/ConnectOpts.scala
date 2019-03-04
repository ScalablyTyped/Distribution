package typings
package anyDashDbLib.anyDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOpts extends js.Object {
  var adapter: java.lang.String
}

object ConnectOpts {
  @scala.inline
  def apply(adapter: java.lang.String): ConnectOpts = {
    val __obj = js.Dynamic.literal(adapter = adapter)
  
    __obj.asInstanceOf[ConnectOpts]
  }
}

