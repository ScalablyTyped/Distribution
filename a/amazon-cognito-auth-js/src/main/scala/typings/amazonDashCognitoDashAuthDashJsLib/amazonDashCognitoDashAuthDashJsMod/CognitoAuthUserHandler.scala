package typings
package amazonDashCognitoDashAuthDashJsLib.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoAuthUserHandler extends js.Object {
  def onFailure(err: js.Any): scala.Unit
  def onSuccess(authSession: CognitoAuthSession): scala.Unit
}

object CognitoAuthUserHandler {
  @scala.inline
  def apply(onFailure: js.Any => scala.Unit, onSuccess: CognitoAuthSession => scala.Unit): CognitoAuthUserHandler = {
    val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess))
  
    __obj.asInstanceOf[CognitoAuthUserHandler]
  }
}

