package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bucket extends js.Object {
  var bucket: Anon_Arn
  var configurationId: java.lang.String
  var `object`: Anon_ETag
  var s3SchemaVersion: java.lang.String
}

object Anon_Bucket {
  @scala.inline
  def apply(
    bucket: Anon_Arn,
    configurationId: java.lang.String,
    `object`: Anon_ETag,
    s3SchemaVersion: java.lang.String
  ): Anon_Bucket = {
    val __obj = js.Dynamic.literal(bucket = bucket, configurationId = configurationId, s3SchemaVersion = s3SchemaVersion)
    __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Anon_Bucket]
  }
}

