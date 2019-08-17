package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceConfig extends js.Object {
  /**
    * The name of the data source.
    */
  var name: Name
  /**
    * The S3 bucket where the data files are located.
    */
  var s3Bucket: S3Bucket
  /**
    * The list of S3 keys identifying the data source files.
    */
  var s3Keys: S3Keys
}

object DataSourceConfig {
  @scala.inline
  def apply(name: Name, s3Bucket: S3Bucket, s3Keys: S3Keys): DataSourceConfig = {
    val __obj = js.Dynamic.literal(name = name, s3Bucket = s3Bucket, s3Keys = s3Keys)
  
    __obj.asInstanceOf[DataSourceConfig]
  }
}

