package typings
package awsDashSdkLib.clientsEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoOptionsStatus extends js.Object {
  /**
    * Specifies the Cognito options for the specified Elasticsearch domain.
    */
  var Options: CognitoOptions
  /**
    * Specifies the status of the Cognito options for the specified Elasticsearch domain.
    */
  var Status: OptionStatus
}

object CognitoOptionsStatus {
  @scala.inline
  def apply(Options: CognitoOptions, Status: OptionStatus): CognitoOptionsStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[CognitoOptionsStatus]
  }
}

