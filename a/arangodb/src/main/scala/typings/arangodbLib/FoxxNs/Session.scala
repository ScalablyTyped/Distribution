package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var created: scala.Double
  var data: js.Any
  var uid: java.lang.String | scala.Null
}

object Session {
  @scala.inline
  def apply(created: scala.Double, data: js.Any, uid: java.lang.String = null): Session = {
    val __obj = js.Dynamic.literal(created = created, data = data)
    if (uid != null) __obj.updateDynamic("uid")(uid)
    __obj.asInstanceOf[Session]
  }
}

