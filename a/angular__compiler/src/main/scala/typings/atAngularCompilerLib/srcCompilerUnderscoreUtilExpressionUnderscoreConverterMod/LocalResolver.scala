package typings
package atAngularCompilerLib.srcCompilerUnderscoreUtilExpressionUnderscoreConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalResolver extends js.Object {
  def getLocal(name: java.lang.String): atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null
}

object LocalResolver {
  @scala.inline
  def apply(
    getLocal: js.Function1[
      java.lang.String, 
      atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression | scala.Null
    ]
  ): LocalResolver = {
    val __obj = js.Dynamic.literal(getLocal = getLocal)
  
    __obj.asInstanceOf[LocalResolver]
  }
}

