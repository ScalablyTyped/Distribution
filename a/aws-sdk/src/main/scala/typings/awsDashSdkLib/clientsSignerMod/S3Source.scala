package typings
package awsDashSdkLib.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3Source extends js.Object {
  /**
    * Name of the S3 bucket.
    */
  var bucketName: BucketName
  /**
    * Key name of the bucket object that contains your unsigned code.
    */
  var key: Key
  /**
    * Version of your source image in your version enabled S3 bucket.
    */
  var version: Version
}

object S3Source {
  @scala.inline
  def apply(bucketName: BucketName, key: Key, version: Version): S3Source = {
    val __obj = js.Dynamic.literal(bucketName = bucketName, key = key, version = version)
  
    __obj.asInstanceOf[S3Source]
  }
}

