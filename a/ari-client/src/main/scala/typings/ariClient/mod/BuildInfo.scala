package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuildInfo extends js.Object {
  /**
    * Date and time when Asterisk was built.
    */
  var date: String = js.native
  /**
    * Kernel version Asterisk was built on.
    */
  var kernel: String = js.native
  /**
    * Machine architecture (x86_64, i686, ppc, etc.).
    */
  var machine: String = js.native
  /**
    * Compile time options, or empty string if default.
    */
  var options: String = js.native
  /**
    * OS Asterisk was built on.
    */
  var os: String = js.native
  /**
    * Username that build Asterisk.
    */
  var user: String = js.native
}

object BuildInfo {
  @scala.inline
  def apply(date: String, kernel: String, machine: String, options: String, os: String, user: String): BuildInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], machine = machine.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildInfo]
  }
  @scala.inline
  implicit class BuildInfoOps[Self <: BuildInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setKernel(value: String): Self = this.set("kernel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMachine(value: String): Self = this.set("machine", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: String): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: String): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

