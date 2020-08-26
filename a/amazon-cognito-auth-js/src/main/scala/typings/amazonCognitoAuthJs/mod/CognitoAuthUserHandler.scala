package typings.amazonCognitoAuthJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoAuthUserHandler extends js.Object {
  def onFailure(err: js.Any): Unit = js.native
  def onSuccess(authSession: CognitoAuthSession): Unit = js.native
}

object CognitoAuthUserHandler {
  @scala.inline
  def apply(onFailure: js.Any => Unit, onSuccess: CognitoAuthSession => Unit): CognitoAuthUserHandler = {
    val __obj = js.Dynamic.literal(onFailure = js.Any.fromFunction1(onFailure), onSuccess = js.Any.fromFunction1(onSuccess))
    __obj.asInstanceOf[CognitoAuthUserHandler]
  }
  @scala.inline
  implicit class CognitoAuthUserHandlerOps[Self <: CognitoAuthUserHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnFailure(value: js.Any => Unit): Self = this.set("onFailure", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSuccess(value: CognitoAuthSession => Unit): Self = this.set("onSuccess", js.Any.fromFunction1(value))
  }
  
}

