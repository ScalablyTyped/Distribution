package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecordsEvent extends js.Object {
  /**
    * The byte array of partial, one or more result records.
    */
  var Payload: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object RecordsEvent {
  @scala.inline
  def apply(Payload: nodeLib.Buffer = null): RecordsEvent = {
    val __obj = js.Dynamic.literal()
    if (Payload != null) __obj.updateDynamic("Payload")(Payload)
    __obj.asInstanceOf[RecordsEvent]
  }
}

