package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePHIDetectionJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a detection job.
    */
  var ComprehendMedicalAsyncJobProperties: js.UndefOr[
    typings.awsDashSdk.clientsComprehendmedicalMod.ComprehendMedicalAsyncJobProperties
  ] = js.native
}

object DescribePHIDetectionJobResponse {
  @scala.inline
  def apply(ComprehendMedicalAsyncJobProperties: ComprehendMedicalAsyncJobProperties = null): DescribePHIDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (ComprehendMedicalAsyncJobProperties != null) __obj.updateDynamic("ComprehendMedicalAsyncJobProperties")(ComprehendMedicalAsyncJobProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePHIDetectionJobResponse]
  }
}

