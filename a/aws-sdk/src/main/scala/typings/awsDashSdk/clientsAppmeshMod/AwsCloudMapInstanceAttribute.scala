package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsCloudMapInstanceAttribute extends js.Object {
  /**
    * The name of an AWS Cloud Map service instance attribute key. Any AWS Cloud Map service
    instance that contains the specified key and value is returned.
    */
  var key: AwsCloudMapInstanceAttributeKey
  /**
    * The value of an AWS Cloud Map service instance attribute key. Any AWS Cloud Map service
    instance that contains the specified key and value is returned.
    */
  var value: AwsCloudMapInstanceAttributeValue
}

object AwsCloudMapInstanceAttribute {
  @scala.inline
  def apply(key: AwsCloudMapInstanceAttributeKey, value: AwsCloudMapInstanceAttributeValue): AwsCloudMapInstanceAttribute = {
    val __obj = js.Dynamic.literal(key = key, value = value)
  
    __obj.asInstanceOf[AwsCloudMapInstanceAttribute]
  }
}

