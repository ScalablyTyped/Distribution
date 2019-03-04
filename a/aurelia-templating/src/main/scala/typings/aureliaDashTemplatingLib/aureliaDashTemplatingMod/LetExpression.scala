package typings
package aureliaDashTemplatingLib.aureliaDashTemplatingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LetExpression extends js.Object {
  def createBinding(): LetBinding
}

object LetExpression {
  @scala.inline
  def apply(createBinding: js.Function0[LetBinding]): LetExpression = {
    val __obj = js.Dynamic.literal(createBinding = createBinding)
  
    __obj.asInstanceOf[LetExpression]
  }
}

