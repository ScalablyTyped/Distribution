package typings
package apostropheLib.apostropheMod.apostropheNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AposModule extends js.Object {
  def emit(name: java.lang.String): scala.Unit
  def on(name: java.lang.String, methodName: js.Any, fn: js.Function0[_]): scala.Unit
}

object AposModule {
  @scala.inline
  def apply(
    emit: java.lang.String => scala.Unit,
    on: (java.lang.String, js.Any, js.Function0[_]) => scala.Unit
  ): AposModule = {
    val __obj = js.Dynamic.literal(emit = js.Any.fromFunction1(emit), on = js.Any.fromFunction3(on))
  
    __obj.asInstanceOf[AposModule]
  }
}

