package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamProcessor extends js.Object {
  /**
    * Name of the Amazon Rekognition stream processor. 
    */
  var Name: js.UndefOr[StreamProcessorName] = js.undefined
  /**
    * Current status of the Amazon Rekognition stream processor.
    */
  var Status: js.UndefOr[StreamProcessorStatus] = js.undefined
}

object StreamProcessor {
  @scala.inline
  def apply(Name: StreamProcessorName = null, Status: StreamProcessorStatus = null): StreamProcessor = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProcessor]
  }
}

