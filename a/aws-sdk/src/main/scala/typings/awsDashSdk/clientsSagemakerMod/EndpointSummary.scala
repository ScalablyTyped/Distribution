package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndpointSummary extends js.Object {
  /**
    * A timestamp that shows when the endpoint was created.
    */
  var CreationTime: Timestamp
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: typings.awsDashSdk.clientsSagemakerMod.EndpointArn
  /**
    * The name of the endpoint.
    */
  var EndpointName: typings.awsDashSdk.clientsSagemakerMod.EndpointName
  /**
    * The status of the endpoint.    OutOfService: Endpoint is not available to take incoming requests.    Creating: CreateEndpoint is executing.    Updating: UpdateEndpoint or UpdateEndpointWeightsAndCapacities is executing.    SystemUpdating: Endpoint is undergoing maintenance and cannot be updated or deleted or re-scaled until it has completed. This maintenance operation does not change any customer-specified values such as VPC config, KMS encryption, model, instance type, or instance count.    RollingBack: Endpoint fails to scale up or down or change its variant weight and is in the process of rolling back to its previous configuration. Once the rollback completes, endpoint returns to an InService status. This transitional status only applies to an endpoint that has autoscaling enabled and is undergoing variant weight or capacity changes as part of an UpdateEndpointWeightsAndCapacities call or when the UpdateEndpointWeightsAndCapacities operation is called explicitly.    InService: Endpoint is available to process incoming requests.    Deleting: DeleteEndpoint is executing.    Failed: Endpoint could not be created, updated, or re-scaled. Use DescribeEndpointOutput$FailureReason for information about the failure. DeleteEndpoint is the only operation that can be performed on a failed endpoint.   To get a list of endpoints with a specified status, use the ListEndpointsInput$StatusEquals filter.
    */
  var EndpointStatus: typings.awsDashSdk.clientsSagemakerMod.EndpointStatus
  /**
    * A timestamp that shows when the endpoint was last modified.
    */
  var LastModifiedTime: Timestamp
}

object EndpointSummary {
  @scala.inline
  def apply(
    CreationTime: Timestamp,
    EndpointArn: EndpointArn,
    EndpointName: EndpointName,
    EndpointStatus: EndpointStatus,
    LastModifiedTime: Timestamp
  ): EndpointSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, EndpointArn = EndpointArn, EndpointName = EndpointName, EndpointStatus = EndpointStatus.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime)
  
    __obj.asInstanceOf[EndpointSummary]
  }
}

