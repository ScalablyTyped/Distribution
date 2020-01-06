package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceMetadata extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the resource.
    */
  var arn: Arn = js.native
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: Timestamp = js.native
  /**
    * The Unix epoch timestamp in seconds for when the resource was last updated.
    */
  var lastUpdatedAt: Timestamp = js.native
  /**
    * The unique identifier for the resource.
    */
  var uid: String = js.native
  /**
    * The version of the resource. Resources are created at version 1, and this version is
    incremented each time that they're updated.
    */
  var version: Long = js.native
}

object ResourceMetadata {
  @scala.inline
  def apply(arn: Arn, createdAt: Timestamp, lastUpdatedAt: Timestamp, uid: String, version: Long): ResourceMetadata = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceMetadata]
  }
}

