package typings.angularCompiler.xmlHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Node extends js.Object {
  def visit(visitor: IVisitor): js.Any
}

object Node {
  @scala.inline
  def apply(visit: IVisitor => js.Any): Node = {
    val __obj = js.Dynamic.literal(visit = js.Any.fromFunction1(visit))
  
    __obj.asInstanceOf[Node]
  }
}

