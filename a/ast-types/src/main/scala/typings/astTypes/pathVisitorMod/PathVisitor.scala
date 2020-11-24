package typings.astTypes.pathVisitorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PathVisitor extends js.Object {
  
  var AbortRequest: js.Any = js.native
  
  var Context: js.Any = js.native
  
  var _abortRequested: Boolean = js.native
  
  var _changeReported: js.Any = js.native
  
  var _methodNameTable: js.Any = js.native
  
  var _reusableContextStack: js.Any = js.native
  
  var _shouldVisitComments: js.Any = js.native
  
  var _visiting: js.Any = js.native
  
  def abort(): Unit = js.native
  
  def acquireContext(path: js.Any): js.Any = js.native
  
  def releaseContext(context: js.Any): Unit = js.native
  
  def reportChanged(): Unit = js.native
  
  def reset(args: js.Any*): js.Any = js.native
  
  def visit(args: js.Any*): js.Any = js.native
  
  def visitWithoutReset(path: js.Any): js.Any = js.native
  
  var visitor: js.Any = js.native
  
  def wasChangeReported(): js.Any = js.native
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
    val __obj = js.Dynamic.literal(AbortRequest = AbortRequest.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], _abortRequested = _abortRequested.asInstanceOf[js.Any], _changeReported = _changeReported.asInstanceOf[js.Any], _methodNameTable = _methodNameTable.asInstanceOf[js.Any], _reusableContextStack = _reusableContextStack.asInstanceOf[js.Any], _shouldVisitComments = _shouldVisitComments.asInstanceOf[js.Any], _visiting = _visiting.asInstanceOf[js.Any], abort = js.Any.fromFunction0(abort), acquireContext = js.Any.fromFunction1(acquireContext), releaseContext = js.Any.fromFunction1(releaseContext), reportChanged = js.Any.fromFunction0(reportChanged), reset = js.Any.fromFunction1(reset), visit = js.Any.fromFunction1(visit), visitWithoutReset = js.Any.fromFunction1(visitWithoutReset), visitor = visitor.asInstanceOf[js.Any], wasChangeReported = js.Any.fromFunction0(wasChangeReported))
    __obj.asInstanceOf[PathVisitor]
  }
  
  @scala.inline
  implicit class PathVisitorOps[Self <: PathVisitor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAbortRequest(value: js.Any): Self = this.set("AbortRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_abortRequested(value: Boolean): Self = this.set("_abortRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_changeReported(value: js.Any): Self = this.set("_changeReported", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_methodNameTable(value: js.Any): Self = this.set("_methodNameTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_reusableContextStack(value: js.Any): Self = this.set("_reusableContextStack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_shouldVisitComments(value: js.Any): Self = this.set("_shouldVisitComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_visiting(value: js.Any): Self = this.set("_visiting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAcquireContext(value: js.Any => js.Any): Self = this.set("acquireContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReleaseContext(value: js.Any => Unit): Self = this.set("releaseContext", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReportChanged(value: () => Unit): Self = this.set("reportChanged", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: /* repeated */ js.Any => js.Any): Self = this.set("reset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisit(value: /* repeated */ js.Any => js.Any): Self = this.set("visit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisitWithoutReset(value: js.Any => js.Any): Self = this.set("visitWithoutReset", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVisitor(value: js.Any): Self = this.set("visitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasChangeReported(value: () => js.Any): Self = this.set("wasChangeReported", js.Any.fromFunction0(value))
  }
}
