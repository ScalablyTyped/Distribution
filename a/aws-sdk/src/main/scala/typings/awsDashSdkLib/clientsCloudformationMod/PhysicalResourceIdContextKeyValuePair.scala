package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicalResourceIdContextKeyValuePair extends js.Object {
  /**
    * The resource context key.
    */
  var Key: awsDashSdkLib.clientsCloudformationMod.Key
  /**
    * The resource context value.
    */
  var Value: awsDashSdkLib.clientsCloudformationMod.Value
}

object PhysicalResourceIdContextKeyValuePair {
  @scala.inline
  def apply(Key: Key, Value: Value): PhysicalResourceIdContextKeyValuePair = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value)
  
    __obj.asInstanceOf[PhysicalResourceIdContextKeyValuePair]
  }
}

