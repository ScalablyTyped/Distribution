package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Configuration extends js.Object {
  /**
    * The ARN of the S3 bucket that contains the data.
    */
  var BucketARN: awsDashSdkLib.clientsKinesisanalyticsv2Mod.BucketARN
  /**
    * The name of the object that contains the data.
    */
  var FileKey: awsDashSdkLib.clientsKinesisanalyticsv2Mod.FileKey
}

object S3Configuration {
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey): S3Configuration = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN, FileKey = FileKey)
  
    __obj.asInstanceOf[S3Configuration]
  }
}

