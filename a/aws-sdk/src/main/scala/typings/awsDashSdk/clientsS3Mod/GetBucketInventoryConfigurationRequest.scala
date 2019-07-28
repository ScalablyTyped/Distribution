package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBucketInventoryConfigurationRequest extends js.Object {
  /**
    * The name of the bucket containing the inventory configuration to retrieve.
    */
  var Bucket: BucketName
  /**
    * The ID used to identify the inventory configuration.
    */
  var Id: InventoryId
}

object GetBucketInventoryConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: InventoryId): GetBucketInventoryConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Id = Id)
  
    __obj.asInstanceOf[GetBucketInventoryConfigurationRequest]
  }
}

