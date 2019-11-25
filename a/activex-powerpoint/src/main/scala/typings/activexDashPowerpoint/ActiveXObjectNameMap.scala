package typings.activexDashPowerpoint

import typings.activexDashPowerpoint.PowerPoint.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `PowerPoint.Application`: Application
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(`PowerPoint.Application`: Application): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PowerPoint.Application")(`PowerPoint.Application`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

