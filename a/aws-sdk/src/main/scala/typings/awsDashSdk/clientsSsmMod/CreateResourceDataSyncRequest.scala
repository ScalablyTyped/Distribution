package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateResourceDataSyncRequest extends js.Object {
  /**
    * Amazon S3 configuration details for the sync.
    */
  var S3Destination: ResourceDataSyncS3Destination
  /**
    * A name for the configuration.
    */
  var SyncName: ResourceDataSyncName
}

object CreateResourceDataSyncRequest {
  @scala.inline
  def apply(S3Destination: ResourceDataSyncS3Destination, SyncName: ResourceDataSyncName): CreateResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(S3Destination = S3Destination, SyncName = SyncName)
  
    __obj.asInstanceOf[CreateResourceDataSyncRequest]
  }
}

