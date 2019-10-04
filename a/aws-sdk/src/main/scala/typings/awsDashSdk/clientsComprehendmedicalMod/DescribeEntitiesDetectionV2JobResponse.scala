package typings.awsDashSdk.clientsComprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEntitiesDetectionV2JobResponse extends js.Object {
  /**
    * An object that contains the properties associated with a detection job.
    */
  var ComprehendMedicalAsyncJobProperties: js.UndefOr[
    typings.awsDashSdk.clientsComprehendmedicalMod.ComprehendMedicalAsyncJobProperties
  ] = js.undefined
}

object DescribeEntitiesDetectionV2JobResponse {
  @scala.inline
  def apply(ComprehendMedicalAsyncJobProperties: ComprehendMedicalAsyncJobProperties = null): DescribeEntitiesDetectionV2JobResponse = {
    val __obj = js.Dynamic.literal()
    if (ComprehendMedicalAsyncJobProperties != null) __obj.updateDynamic("ComprehendMedicalAsyncJobProperties")(ComprehendMedicalAsyncJobProperties)
    __obj.asInstanceOf[DescribeEntitiesDetectionV2JobResponse]
  }
}

