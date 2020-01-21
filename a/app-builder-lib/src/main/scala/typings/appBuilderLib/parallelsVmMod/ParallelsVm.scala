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

trait ParallelsVm extends js.Object {
  var id: String
  var name: String
  var os: `win-10` | ubuntu | elementary
  var state: running | suspended | stopped
}

object ParallelsVm {
  @scala.inline
  def apply(id: String, name: String, os: `win-10` | ubuntu | elementary, state: running | suspended | stopped): ParallelsVm = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParallelsVm]
  }
}

