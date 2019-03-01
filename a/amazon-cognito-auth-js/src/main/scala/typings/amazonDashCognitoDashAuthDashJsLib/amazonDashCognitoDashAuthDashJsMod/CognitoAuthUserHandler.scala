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
  def apply(
    onFailure: js.Function1[js.Any, scala.Unit],
    onSuccess: js.Function1[CognitoAuthSession, scala.Unit]
  ): CognitoAuthUserHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onFailure")(onFailure)
    __obj.updateDynamic("onSuccess")(onSuccess)
    __obj.asInstanceOf[CognitoAuthUserHandler]
  }
}

