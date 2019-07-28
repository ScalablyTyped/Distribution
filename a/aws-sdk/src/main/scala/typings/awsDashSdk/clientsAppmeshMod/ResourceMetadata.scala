package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceMetadata extends js.Object {
  /**
    * The full Amazon Resource Name (ARN) for the resource.
    */
  var arn: Arn
  /**
    * The Unix epoch timestamp in seconds for when the resource was created.
    */
  var createdAt: Timestamp
  /**
    * The Unix epoch timestamp in seconds for when the resource was last updated.
    */
  var lastUpdatedAt: Timestamp
  /**
    * The unique identifier for the resource.
    */
  var uid: String
  /**
    * The version of the resource. Resources are created at version 1, and this version is
    incremented each time that they're updated.
    */
  var version: Long
}

object ResourceMetadata {
  @scala.inline
  def apply(arn: Arn, createdAt: Timestamp, lastUpdatedAt: Timestamp, uid: String, version: Long): ResourceMetadata = {
    val __obj = js.Dynamic.literal(arn = arn, createdAt = createdAt, lastUpdatedAt = lastUpdatedAt, uid = uid, version = version)
  
    __obj.asInstanceOf[ResourceMetadata]
  }
}

