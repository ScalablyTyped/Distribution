package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndpointInput extends js.Object {
  /**
    * An endpoint in customer's account which has enabled DataCaptureConfig enabled.
    */
  var EndpointName: typings.awsDashSdk.clientsSagemakerMod.EndpointName = js.native
  /**
    * Path to the filesystem where the endpoint data is available to the container.
    */
  var LocalPath: ProcessingLocalPath = js.native
  /**
    * Whether input data distributed in Amazon S3 is fully replicated or sharded by an S3 key. Defauts to FullyReplicated 
    */
  var S3DataDistributionType: js.UndefOr[ProcessingS3DataDistributionType] = js.native
  /**
    * Whether the Pipe or File is used as the input mode for transfering data for the monitoring job. Pipe mode is recommended for large datasets. File mode is useful for small files that fit in memory. Defaults to File.
    */
  var S3InputMode: js.UndefOr[ProcessingS3InputMode] = js.native
}

object EndpointInput {
  @scala.inline
  def apply(
    EndpointName: EndpointName,
    LocalPath: ProcessingLocalPath,
    S3DataDistributionType: ProcessingS3DataDistributionType = null,
    S3InputMode: ProcessingS3InputMode = null
  ): EndpointInput = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any], LocalPath = LocalPath.asInstanceOf[js.Any])
    if (S3DataDistributionType != null) __obj.updateDynamic("S3DataDistributionType")(S3DataDistributionType.asInstanceOf[js.Any])
    if (S3InputMode != null) __obj.updateDynamic("S3InputMode")(S3InputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointInput]
  }
}

