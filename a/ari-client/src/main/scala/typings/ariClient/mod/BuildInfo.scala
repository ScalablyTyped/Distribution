package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildInfo extends js.Object {
  var date: String
  var kernel: String
  var machine: String
  var options: String
  /* Properties */
  var os: String
  var user: String
}

object BuildInfo {
  @scala.inline
  def apply(date: String, kernel: String, machine: String, options: String, os: String, user: String): BuildInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], machine = machine.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildInfo]
  }
}

