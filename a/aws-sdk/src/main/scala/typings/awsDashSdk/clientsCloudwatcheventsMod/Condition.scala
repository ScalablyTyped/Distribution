package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /**
    * The key for the condition. Currently, the only supported key is aws:PrincipalOrgID.
    */
  var Key: String
  /**
    * The type of condition. Currently, the only supported value is StringEquals.
    */
  var Type: String
  /**
    * The value for the key. Currently, this must be the ID of the organization.
    */
  var Value: String
}

object Condition {
  @scala.inline
  def apply(Key: String, Type: String, Value: String): Condition = {
    val __obj = js.Dynamic.literal(Key = Key, Type = Type, Value = Value)
  
    __obj.asInstanceOf[Condition]
  }
}

