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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AbortRequest")(AbortRequest)
    __obj.updateDynamic("Context")(Context)
    __obj.updateDynamic("_abortRequested")(_abortRequested)
    __obj.updateDynamic("_changeReported")(_changeReported)
    __obj.updateDynamic("_methodNameTable")(_methodNameTable)
    __obj.updateDynamic("_reusableContextStack")(_reusableContextStack)
    __obj.updateDynamic("_shouldVisitComments")(_shouldVisitComments)
    __obj.updateDynamic("_visiting")(_visiting)
    __obj.updateDynamic("abort")(abort)
    __obj.updateDynamic("acquireContext")(acquireContext)
    __obj.updateDynamic("releaseContext")(releaseContext)
    __obj.updateDynamic("reportChanged")(reportChanged)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("visit")(visit)
    __obj.updateDynamic("visitWithoutReset")(visitWithoutReset)
    __obj.updateDynamic("visitor")(visitor)
    __obj.updateDynamic("wasChangeReported")(wasChangeReported)
    __obj.asInstanceOf[PathVisitor]
  }
}

