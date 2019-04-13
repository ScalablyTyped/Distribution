package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveSourceIdentifierFromSubscriptionMessage extends js.Object {
  /**
    *  The source identifier to be removed from the subscription, such as the DB instance identifier for a DB instance or the name of a security group. 
    */
  var SourceIdentifier: String
  /**
    * The name of the RDS event notification subscription you want to remove a source identifier from.
    */
  var SubscriptionName: String
}

object RemoveSourceIdentifierFromSubscriptionMessage {
  @scala.inline
  def apply(SourceIdentifier: String, SubscriptionName: String): RemoveSourceIdentifierFromSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SourceIdentifier = SourceIdentifier, SubscriptionName = SubscriptionName)
  
    __obj.asInstanceOf[RemoveSourceIdentifierFromSubscriptionMessage]
  }
}

