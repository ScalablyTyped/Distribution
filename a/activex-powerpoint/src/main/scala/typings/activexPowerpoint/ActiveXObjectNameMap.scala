package typings.activexPowerpoint

import typings.activexPowerpoint.PowerPoint.Application
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  @JSName("PowerPoint.Application")
  var PowerPointDotApplication: Application
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(PowerPointDotApplication: Application): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PowerPoint.Application")(PowerPointDotApplication.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

