package typings.astTypes.pathVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedContextMethods extends js.Object {
  var Context: js.Any = js.native
  var currentPath: js.Any = js.native
  var needToCallTraverse: Boolean = js.native
  var visitor: js.Any = js.native
  def abort(): Unit = js.native
  def invokeVisitorMethod(methodName: String): js.Any = js.native
  def reportChanged(): Unit = js.native
  def reset(path: js.Any, args: js.Any*): js.Any = js.native
  def traverse(path: js.Any): js.Any = js.native
  def traverse(path: js.Any, newVisitor: VisitorMethods): js.Any = js.native
  def visit(path: js.Any): js.Any = js.native
  def visit(path: js.Any, newVisitor: VisitorMethods): js.Any = js.native
}

