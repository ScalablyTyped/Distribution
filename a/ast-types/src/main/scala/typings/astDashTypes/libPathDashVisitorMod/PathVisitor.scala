package typings.astDashTypes.libPathDashVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PathVisitor extends js.Object {
  var AbortRequest: js.Any
  var Context: js.Any
  var _abortRequested: Boolean
  var _changeReported: js.Any
  var _methodNameTable: js.Any
  var _reusableContextStack: js.Any
  var _shouldVisitComments: js.Any
  var _visiting: js.Any
  var visitor: js.Any
  def abort(): Unit
  def acquireContext(path: js.Any): js.Any
  def releaseContext(context: js.Any): Unit
  def reportChanged(): Unit
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
    _abortRequested: Boolean,
    _changeReported: js.Any,
    _methodNameTable: js.Any,
    _reusableContextStack: js.Any,
    _shouldVisitComments: js.Any,
    _visiting: js.Any,
    abort: () => Unit,
    acquireContext: js.Any => js.Any,
    releaseContext: js.Any => Unit,
    reportChanged: () => Unit,
    reset: /* repeated */ js.Any => js.Any,
    visit: /* repeated */ js.Any => js.Any,
    visitWithoutReset: js.Any => js.Any,
    visitor: js.Any,
    wasChangeReported: () => js.Any
  ): PathVisitor = {
    val __obj = js.Dynamic.literal(AbortRequest = AbortRequest, Context = Context, _abortRequested = _abortRequested, _changeReported = _changeReported, _methodNameTable = _methodNameTable, _reusableContextStack = _reusableContextStack, _shouldVisitComments = _shouldVisitComments, _visiting = _visiting, abort = js.Any.fromFunction0(abort), acquireContext = js.Any.fromFunction1(acquireContext), releaseContext = js.Any.fromFunction1(releaseContext), reportChanged = js.Any.fromFunction0(reportChanged), reset = js.Any.fromFunction1(reset), visit = js.Any.fromFunction1(visit), visitWithoutReset = js.Any.fromFunction1(visitWithoutReset), visitor = visitor, wasChangeReported = js.Any.fromFunction0(wasChangeReported))
  
    __obj.asInstanceOf[PathVisitor]
  }
}

