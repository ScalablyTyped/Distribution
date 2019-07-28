package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSamplingTargetsRequest extends js.Object {
  /**
    * Information about rules that the service is using to sample requests.
    */
  var SamplingStatisticsDocuments: SamplingStatisticsDocumentList
}

object GetSamplingTargetsRequest {
  @scala.inline
  def apply(SamplingStatisticsDocuments: SamplingStatisticsDocumentList): GetSamplingTargetsRequest = {
    val __obj = js.Dynamic.literal(SamplingStatisticsDocuments = SamplingStatisticsDocuments)
  
    __obj.asInstanceOf[GetSamplingTargetsRequest]
  }
}

