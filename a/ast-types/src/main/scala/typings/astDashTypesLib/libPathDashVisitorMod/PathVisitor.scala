package typings
package astDashTypesLib.libPathDashVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathVisitor extends js.Object {
  var AbortRequest: js.Any
  var Context: js.Any
  var _abortRequested: scala.Boolean
  var _changeReported: js.Any
  var _methodNameTable: js.Any
  var _reusableContextStack: js.Any
  var _shouldVisitComments: js.Any
  var _visiting: js.Any
  var visitor: js.Any
  def abort(): scala.Unit
  def acquireContext(path: js.Any): js.Any
  def releaseContext(context: js.Any): scala.Unit
  def reportChanged(): scala.Unit
  def reset(args: js.Any*): js.Any
  def visit(args: js.Any*): js.Any
  def visitWithoutReset(path: js.Any): js.Any
  def wasChangeReported(): js.Any
}

object PathVisitor {
  @scala.inline
  def apply(
    AbortRequest: js.Any,
    Context: js.Any,
    _abortRequested: scala.Boolean,
    _changeReported: js.Any,
    _methodNameTable: js.Any,
    _reusableContextStack: js.Any,
    _shouldVisitComments: js.Any,
    _visiting: js.Any,
    abort: js.Function0[scala.Unit],
    acquireContext: js.Function1[js.Any, js.Any],
    releaseContext: js.Function1[js.Any, scala.Unit],
    reportChanged: js.Function0[scala.Unit],
    reset: js.Function1[/* repeated */ js.Any, js.Any],
    visit: js.Function1[/* repeated */ js.Any, js.Any],
    visitWithoutReset: js.Function1[js.Any, js.Any],
    visitor: js.Any,
    wasChangeReported: js.Function0[js.Any]
  ): PathVisitor = {
    val __obj = js.Dynamic.literal(AbortRequest = AbortRequest, Context = Context, _abortRequested = _abortRequested, _changeReported = _changeReported, _methodNameTable = _methodNameTable, _reusableContextStack = _reusableContextStack, _shouldVisitComments = _shouldVisitComments, _visiting = _visiting, abort = abort, acquireContext = acquireContext, releaseContext = releaseContext, reportChanged = reportChanged, reset = reset, visit = visit, visitWithoutReset = visitWithoutReset, visitor = visitor, wasChangeReported = wasChangeReported)
  
    __obj.asInstanceOf[PathVisitor]
  }
}

