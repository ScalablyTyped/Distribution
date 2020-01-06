package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddSourceIdentifierToSubscriptionMessage extends js.Object {
  /**
    * The identifier of the event source to be added. Constraints:   If the source type is a DB instance, then a DBInstanceIdentifier must be supplied.   If the source type is a DB security group, a DBSecurityGroupName must be supplied.   If the source type is a DB parameter group, a DBParameterGroupName must be supplied.   If the source type is a DB snapshot, a DBSnapshotIdentifier must be supplied.  
    */
  var SourceIdentifier: String = js.native
  /**
    * The name of the event notification subscription you want to add a source identifier to.
    */
  var SubscriptionName: String = js.native
}

object AddSourceIdentifierToSubscriptionMessage {
  @scala.inline
  def apply(SourceIdentifier: String, SubscriptionName: String): AddSourceIdentifierToSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SourceIdentifier = SourceIdentifier.asInstanceOf[js.Any], SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddSourceIdentifierToSubscriptionMessage]
  }
}

