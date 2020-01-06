package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDominantLanguageDetectionJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a dominant language detection job.
    */
  var DominantLanguageDetectionJobProperties: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.DominantLanguageDetectionJobProperties] = js.native
}

object DescribeDominantLanguageDetectionJobResponse {
  @scala.inline
  def apply(DominantLanguageDetectionJobProperties: DominantLanguageDetectionJobProperties = null): DescribeDominantLanguageDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (DominantLanguageDetectionJobProperties != null) __obj.updateDynamic("DominantLanguageDetectionJobProperties")(DominantLanguageDetectionJobProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDominantLanguageDetectionJobResponse]
  }
}

