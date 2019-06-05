package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketReplicationOutput extends js.Object {
  /**
    * 
    */
  var ReplicationConfiguration: js.UndefOr[ReplicationConfiguration] = js.undefined
}

object GetBucketReplicationOutput {
  @scala.inline
  def apply(ReplicationConfiguration: ReplicationConfiguration = null): GetBucketReplicationOutput = {
    val __obj = js.Dynamic.literal()
    if (ReplicationConfiguration != null) __obj.updateDynamic("ReplicationConfiguration")(ReplicationConfiguration)
    __obj.asInstanceOf[GetBucketReplicationOutput]
  }
}

