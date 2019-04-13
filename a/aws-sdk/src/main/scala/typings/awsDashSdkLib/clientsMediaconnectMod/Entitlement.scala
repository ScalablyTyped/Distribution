package typings
package awsDashSdkLib.clientsMediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entitlement extends js.Object {
  /**
    * A description of the entitlement.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The type of encryption that will be used on the output that is associated with this entitlement.
    */
  var Encryption: js.UndefOr[Encryption] = js.undefined
  /**
    * The ARN of the entitlement.
    */
  var EntitlementArn: __string
  /**
    * The name of the entitlement.
    */
  var Name: __string
  /**
    * The AWS account IDs that you want to share your content with. The receiving accounts (subscribers) will be allowed to create their own flow using your content as the source.
    */
  var Subscribers: __listOf__string
}

object Entitlement {
  @scala.inline
  def apply(
    EntitlementArn: __string,
    Name: __string,
    Subscribers: __listOf__string,
    Description: __string = null,
    Encryption: Encryption = null
  ): Entitlement = {
    val __obj = js.Dynamic.literal(EntitlementArn = EntitlementArn, Name = Name, Subscribers = Subscribers)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Encryption != null) __obj.updateDynamic("Encryption")(Encryption)
    __obj.asInstanceOf[Entitlement]
  }
}

