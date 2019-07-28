package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoMemberDefinition extends js.Object {
  /**
    * An identifier for an application client. You must create the app client ID using Amazon Cognito.
    */
  var ClientId: CognitoClientId
  /**
    * An identifier for a user group.
    */
  var UserGroup: CognitoUserGroup
  /**
    * An identifier for a user pool. The user pool must be in the same region as the service that you are calling.
    */
  var UserPool: CognitoUserPool
}

object CognitoMemberDefinition {
  @scala.inline
  def apply(ClientId: CognitoClientId, UserGroup: CognitoUserGroup, UserPool: CognitoUserPool): CognitoMemberDefinition = {
    val __obj = js.Dynamic.literal(ClientId = ClientId, UserGroup = UserGroup, UserPool = UserPool)
  
    __obj.asInstanceOf[CognitoMemberDefinition]
  }
}

