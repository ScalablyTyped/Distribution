package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDetectorModelRequest extends js.Object {
  /**
    * The name of the detector model to be deleted.
    */
  var detectorModelName: DetectorModelName
}

object DeleteDetectorModelRequest {
  @scala.inline
  def apply(detectorModelName: DetectorModelName): DeleteDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelName = detectorModelName)
  
    __obj.asInstanceOf[DeleteDetectorModelRequest]
  }
}

