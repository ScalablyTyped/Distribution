package typings
package awsDashSdkLib.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDominantLanguageDetectionJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a dominant language detection job.
    */
  var DominantLanguageDetectionJobProperties: js.UndefOr[DominantLanguageDetectionJobProperties] = js.undefined
}

object DescribeDominantLanguageDetectionJobResponse {
  @scala.inline
  def apply(DominantLanguageDetectionJobProperties: DominantLanguageDetectionJobProperties = null): DescribeDominantLanguageDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (DominantLanguageDetectionJobProperties != null) __obj.updateDynamic("DominantLanguageDetectionJobProperties")(DominantLanguageDetectionJobProperties)
    __obj.asInstanceOf[DescribeDominantLanguageDetectionJobResponse]
  }
}

