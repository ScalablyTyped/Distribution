package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONOutput extends js.Object {
  /**
    * The value used to separate individual records in the output.
    */
  var RecordDelimiter: js.UndefOr[RecordDelimiter] = js.undefined
}

object JSONOutput {
  @scala.inline
  def apply(RecordDelimiter: RecordDelimiter = null): JSONOutput = {
    val __obj = js.Dynamic.literal()
    if (RecordDelimiter != null) __obj.updateDynamic("RecordDelimiter")(RecordDelimiter)
    __obj.asInstanceOf[JSONOutput]
  }
}

