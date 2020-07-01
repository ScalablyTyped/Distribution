package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildInfo extends js.Object {
  /**
    * Date and time when Asterisk was built.
    */
  var date: String
  /**
    * Kernel version Asterisk was built on.
    */
  var kernel: String
  /**
    * Machine architecture (x86_64, i686, ppc, etc.).
    */
  var machine: String
  /**
    * Compile time options, or empty string if default.
    */
  var options: String
  /**
    * OS Asterisk was built on.
    */
  var os: String
  /**
    * Username that build Asterisk.
    */
  var user: String
}

object BuildInfo {
  @scala.inline
  def apply(date: String, kernel: String, machine: String, options: String, os: String, user: String): BuildInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], machine = machine.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildInfo]
  }
}

