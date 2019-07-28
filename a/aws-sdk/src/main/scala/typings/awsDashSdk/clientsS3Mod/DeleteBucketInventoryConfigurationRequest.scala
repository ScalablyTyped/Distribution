package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBucketInventoryConfigurationRequest extends js.Object {
  /**
    * The name of the bucket containing the inventory configuration to delete.
    */
  var Bucket: BucketName
  /**
    * The ID used to identify the inventory configuration.
    */
  var Id: InventoryId
}

object DeleteBucketInventoryConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: InventoryId): DeleteBucketInventoryConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Id = Id)
  
    __obj.asInstanceOf[DeleteBucketInventoryConfigurationRequest]
  }
}

