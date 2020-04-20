package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCloudMapInstanceAttribute extends js.Object {
  /**
    * The name of an AWS Cloud Map service instance attribute key. Any AWS Cloud Map service
    instance that contains the specified key and value is returned.
    */
  var key: AwsCloudMapInstanceAttributeKey = js.native
  /**
    * The value of an AWS Cloud Map service instance attribute key. Any AWS Cloud Map service
    instance that contains the specified key and value is returned.
    */
  var value: AwsCloudMapInstanceAttributeValue = js.native
}

object AwsCloudMapInstanceAttribute {
  @scala.inline
  def apply(key: AwsCloudMapInstanceAttributeKey, value: AwsCloudMapInstanceAttributeValue): AwsCloudMapInstanceAttribute = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCloudMapInstanceAttribute]
  }
}

