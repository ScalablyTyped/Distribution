package typings
package atAngularCompilerLib.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalResolver extends js.Object {
  def getLocal(name: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null
  def notifyImplicitReceiverUse(): scala.Unit
}

object LocalResolver {
  @scala.inline
  def apply(
    getLocal: java.lang.String => atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null,
    notifyImplicitReceiverUse: () => scala.Unit
  ): LocalResolver = {
    val __obj = js.Dynamic.literal(getLocal = js.Any.fromFunction1(getLocal), notifyImplicitReceiverUse = js.Any.fromFunction0(notifyImplicitReceiverUse))
  
    __obj.asInstanceOf[LocalResolver]
  }
}

