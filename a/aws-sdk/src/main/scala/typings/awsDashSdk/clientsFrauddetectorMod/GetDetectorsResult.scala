package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDetectorsResult extends js.Object {
  /**
    * The detectors.
    */
  var detectors: js.UndefOr[DetectorList] = js.native
  /**
    * The next page token.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetDetectorsResult {
  @scala.inline
  def apply(detectors: DetectorList = null, nextToken: String = null): GetDetectorsResult = {
    val __obj = js.Dynamic.literal()
    if (detectors != null) __obj.updateDynamic("detectors")(detectors.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDetectorsResult]
  }
}

