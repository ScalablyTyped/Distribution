package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutApplicationPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: __string = js.native
  /**
    * An array of policy statements applied to the application.
    */
  var Statements: __listOfApplicationPolicyStatement = js.native
}

object PutApplicationPolicyRequest {
  @scala.inline
  def apply(ApplicationId: __string, Statements: __listOfApplicationPolicyStatement): PutApplicationPolicyRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Statements = Statements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutApplicationPolicyRequest]
  }
}

