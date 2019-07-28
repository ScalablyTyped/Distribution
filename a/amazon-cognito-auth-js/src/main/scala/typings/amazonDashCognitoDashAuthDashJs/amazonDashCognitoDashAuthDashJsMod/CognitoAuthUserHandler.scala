package typings.amazonDashCognitoDashAuthDashJs.amazonDashCognitoDashAuthDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoAuthUserHandler extends js.Object {
  def onFailure(err: js.Any): Unit
  def onSuccess(authSession: CognitoAuthSession): Unit
}

object CognitoAuthUserHandler {
  @scala.inline
  def apply(onFailure: js.Any => Unit, onSuccess: CognitoAuthSession => Unit): CognitoAuthUserHandler = {
    val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess))
  
    __obj.asInstanceOf[CognitoAuthUserHandler]
  }
}

