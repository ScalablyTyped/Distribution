package typings.appBuilderLib.parallelsVmMod

import typings.appBuilderLib.appBuilderLibStrings.`win-10`
import typings.appBuilderLib.appBuilderLibStrings.elementary
import typings.appBuilderLib.appBuilderLibStrings.running
import typings.appBuilderLib.appBuilderLibStrings.stopped
import typings.appBuilderLib.appBuilderLibStrings.suspended
import typings.appBuilderLib.appBuilderLibStrings.ubuntu
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParallelsVm extends js.Object {
  var id: String = js.native
  var name: String = js.native
  var os: `win-10` | ubuntu | elementary = js.native
  var state: running | suspended | stopped = js.native
}

object ParallelsVm {
  @scala.inline
  def apply(id: String, name: String, os: `win-10` | ubuntu | elementary, state: running | suspended | stopped): ParallelsVm = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParallelsVm]
  }
  @scala.inline
  implicit class ParallelsVmOps[Self <: ParallelsVm] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOs(value: `win-10` | ubuntu | elementary): Self = this.set("os", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: running | suspended | stopped): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

