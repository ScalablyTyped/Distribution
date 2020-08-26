package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessOptions extends NodeProcessOptions {
  /**
    *  Whether the command will automatically start when this BufferedProcess is
    *  created.
    */
  var autoStart: js.UndefOr[Boolean] = js.native
}

object ProcessOptions {
  @scala.inline
  def apply(command: String): ProcessOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessOptions]
  }
  @scala.inline
  implicit class ProcessOptionsOps[Self <: ProcessOptions] (val x: Self) extends AnyVal {
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
    def setAutoStart(value: Boolean): Self = this.set("autoStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoStart: Self = this.set("autoStart", js.undefined)
  }
  
}

