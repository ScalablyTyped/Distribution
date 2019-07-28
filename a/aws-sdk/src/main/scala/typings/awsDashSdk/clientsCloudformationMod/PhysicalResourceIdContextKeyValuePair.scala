package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicalResourceIdContextKeyValuePair extends js.Object {
  /**
    * The resource context key.
    */
  var Key: typings.awsDashSdk.clientsCloudformationMod.Key
  /**
    * The resource context value.
    */
  var Value: typings.awsDashSdk.clientsCloudformationMod.Value
}

object PhysicalResourceIdContextKeyValuePair {
  @scala.inline
  def apply(Key: Key, Value: Value): PhysicalResourceIdContextKeyValuePair = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value)
  
    __obj.asInstanceOf[PhysicalResourceIdContextKeyValuePair]
  }
}

