package typings.awsDashSdk.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListedEntitlement extends js.Object {
  /**
    * The ARN of the entitlement.
    */
  var EntitlementArn: __string
  /**
    * The name of the entitlement.
    */
  var EntitlementName: __string
}

object ListedEntitlement {
  @scala.inline
  def apply(EntitlementArn: __string, EntitlementName: __string): ListedEntitlement = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn, EntitlementName = EntitlementName)
  
    __obj.asInstanceOf[ListedEntitlement]
  }
}

