package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationPolicyStatement extends js.Object {
  /**
    * For the list of actions supported for this operation, see Application 
    Permissions.
    */
  var Actions: __listOf__string = js.native
  /**
    * An array of AWS account IDs, or * to make the application public.
    */
  var Principals: __listOf__string = js.native
  /**
    * A unique ID for the statement.
    */
  var StatementId: js.UndefOr[__string] = js.native
}

object ApplicationPolicyStatement {
  @scala.inline
  def apply(Actions: __listOf__string, Principals: __listOf__string, StatementId: __string = null): ApplicationPolicyStatement = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Principals = Principals.asInstanceOf[js.Any])
    if (StatementId != null) __obj.updateDynamic("StatementId")(StatementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationPolicyStatement]
  }
}

