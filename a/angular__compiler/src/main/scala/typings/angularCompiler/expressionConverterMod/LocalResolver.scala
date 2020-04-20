package typings.angularCompiler.expressionConverterMod

import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalResolver extends js.Object {
  def getLocal(name: String): Expression | Null
  def notifyImplicitReceiverUse(): Unit
}

object LocalResolver {
  @scala.inline
  def apply(getLocal: String => Expression | Null, notifyImplicitReceiverUse: () => Unit): LocalResolver = {
    val __obj = js.Dynamic.literal(getLocal = js.Any.fromFunction1(getLocal), notifyImplicitReceiverUse = js.Any.fromFunction0(notifyImplicitReceiverUse))
    __obj.asInstanceOf[LocalResolver]
  }
}

