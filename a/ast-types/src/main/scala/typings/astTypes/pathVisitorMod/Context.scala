package typings.astTypes.pathVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/lib/path-visitor.PathVisitor, 'visit' | 'reset'> */
/* Inlined parent ast-types.ast-types/lib/path-visitor.SharedContextMethods */
@js.native
trait Context extends js.Object {
  
  var AbortRequest: js.Any = js.native
  
  var Context: js.Any = js.native
  
  var _abortRequested: Boolean = js.native
  
  var _changeReported: js.Any = js.native
  
  var _methodNameTable: js.Any = js.native
  
  var _reusableContextStack: js.Any = js.native
  
  var _shouldVisitComments: js.Any = js.native
  
  var _visiting: js.Any = js.native
  
  def abort(): Unit = js.native
  @JSName("abort")
  var abort_Original: js.Function0[Unit] = js.native
  
  def acquireContext(path: js.Any): js.Any = js.native
  @JSName("acquireContext")
  var acquireContext_Original: js.Function1[/* path */ js.Any, _] = js.native
  
  var currentPath: js.Any = js.native
  
  def invokeVisitorMethod(methodName: String): js.Any = js.native
  
  var needToCallTraverse: Boolean = js.native
  
  def releaseContext(context: js.Any): Unit = js.native
  @JSName("releaseContext")
  var releaseContext_Original: js.Function1[/* context */ js.Any, Unit] = js.native
  
  def reportChanged(): Unit = js.native
  @JSName("reportChanged")
  var reportChanged_Original: js.Function0[Unit] = js.native
  
  def reset(path: js.Any, args: js.Any*): js.Any = js.native
  
  def traverse(path: js.Any): js.Any = js.native
  def traverse(path: js.Any, newVisitor: VisitorMethods): js.Any = js.native
  
  def visit(path: js.Any): js.Any = js.native
  def visit(path: js.Any, newVisitor: VisitorMethods): js.Any = js.native
  
  def visitWithoutReset(path: js.Any): js.Any = js.native
  @JSName("visitWithoutReset")
  var visitWithoutReset_Original: js.Function1[/* path */ js.Any, _] = js.native
  
  var visitor: js.Any = js.native
  
  def wasChangeReported(): js.Any = js.native
  @JSName("wasChangeReported")
  var wasChangeReported_Original: js.Function0[_] = js.native
}
