package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketInventoryConfigurationRequest extends js.Object {
  /**
    * The name of the bucket where the inventory configuration will be stored.
    */
  var Bucket: BucketName
  /**
    * The ID used to identify the inventory configuration.
    */
  var Id: InventoryId
  /**
    * Specifies the inventory configuration.
    */
  var InventoryConfiguration: typings.awsDashSdk.clientsS3Mod.InventoryConfiguration
}

object PutBucketInventoryConfigurationRequest {
  @scala.inline
  def apply(Bucket: BucketName, Id: InventoryId, InventoryConfiguration: InventoryConfiguration): PutBucketInventoryConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket, Id = Id, InventoryConfiguration = InventoryConfiguration)
  
    __obj.asInstanceOf[PutBucketInventoryConfigurationRequest]
  }
}

