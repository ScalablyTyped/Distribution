package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListVolumeInitiatorsOutput extends js.Object {
  /**
    * The host names and port numbers of all iSCSI initiators that are connected to the gateway.
    */
  var Initiators: js.UndefOr[Initiators] = js.undefined
}

object ListVolumeInitiatorsOutput {
  @scala.inline
  def apply(Initiators: Initiators = null): ListVolumeInitiatorsOutput = {
    val __obj = js.Dynamic.literal()
    if (Initiators != null) __obj.updateDynamic("Initiators")(Initiators)
    __obj.asInstanceOf[ListVolumeInitiatorsOutput]
  }
}

