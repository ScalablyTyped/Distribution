package typings.awsDashSdk.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoOptionsStatus extends js.Object {
  /**
    * Specifies the Cognito options for the specified Elasticsearch domain.
    */
  var Options: CognitoOptions = js.native
  /**
    * Specifies the status of the Cognito options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus = js.native
}

object CognitoOptionsStatus {
  @scala.inline
  def apply(Options: CognitoOptions, Status: OptionStatus): CognitoOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CognitoOptionsStatus]
  }
}

