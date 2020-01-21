package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBucket extends js.Object {
  var bucket: AnonArn
  var configurationId: String
  var `object`: AnonETag
  var s3SchemaVersion: String
}

object AnonBucket {
  @scala.inline
  def apply(bucket: AnonArn, configurationId: String, `object`: AnonETag, s3SchemaVersion: String): AnonBucket = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], configurationId = configurationId.asInstanceOf[js.Any], s3SchemaVersion = s3SchemaVersion.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBucket]
  }
}

