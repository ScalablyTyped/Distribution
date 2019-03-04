package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoIdentity extends js.Object {
  var cognitoIdentityId: java.lang.String
  var cognitoIdentityPoolId: java.lang.String
}

object CognitoIdentity {
  @scala.inline
  def apply(cognitoIdentityId: java.lang.String, cognitoIdentityPoolId: java.lang.String): CognitoIdentity = {
    val __obj = js.Dynamic.literal(cognitoIdentityId = cognitoIdentityId, cognitoIdentityPoolId = cognitoIdentityPoolId)
  
    __obj.asInstanceOf[CognitoIdentity]
  }
}

