package typings.apostrophe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AposModule extends js.Object {
  def emit(name: String): Unit
  def on(name: String, methodName: js.Any, fn: js.Function0[_]): Unit
}

object AposModule {
  @scala.inline
  def apply(emit: String => Unit, on: (String, js.Any, js.Function0[_]) => Unit): AposModule = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), on = js.Any.fromFunction3(on))
  
    __obj.asInstanceOf[AposModule]
  }
}

