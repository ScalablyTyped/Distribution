package typings.awsSdk.appmeshMod

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
    * The AWS IAM account ID of the service mesh owner. If the account ID is not your own, then it's
    the ID of the account that shared the mesh with your account. For more information about mesh sharing, see Working with Shared Meshes.
    */
  var meshOwner: AccountId = js.native
  /**
    * The AWS IAM account ID of the resource owner. If the account ID is not your own, then it's
    the ID of the mesh owner or of another account that the mesh is shared with. For more information about mesh sharing, see Working with Shared Meshes.
    */
  var resourceOwner: AccountId = js.native
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
  def apply(
    arn: Arn,
    createdAt: Timestamp,
    lastUpdatedAt: Timestamp,
    meshOwner: AccountId,
    resourceOwner: AccountId,
    uid: String,
    version: Long
  ): ResourceMetadata = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], lastUpdatedAt = lastUpdatedAt.asInstanceOf[js.Any], meshOwner = meshOwner.asInstanceOf[js.Any], resourceOwner = resourceOwner.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceMetadata]
  }
}

