package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputLocationRef extends js.Object {
  var DestinationRefId: js.UndefOr[__string] = js.undefined
}

object OutputLocationRef {
  @scala.inline
  def apply(DestinationRefId: __string = null): OutputLocationRef = {
    val __obj = js.Dynamic.literal()
    if (DestinationRefId != null) __obj.updateDynamic("DestinationRefId")(DestinationRefId)
    __obj.asInstanceOf[OutputLocationRef]
  }
}

