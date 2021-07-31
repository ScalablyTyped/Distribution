package typings.astTypes

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.astTypes.astTypesMod.Fork
import typings.astTypes.nodePathMod.NodePath
import typings.astTypes.typesMod.ASTNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathVisitorMod {
  
  @JSImport("ast-types/lib/path-visitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(fork: Fork): PathVisitorConstructor = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fork.asInstanceOf[js.Any]).asInstanceOf[PathVisitorConstructor]
  
  /* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/lib/path-visitor.PathVisitor, 'visit' | 'reset'> */
  /* Inlined parent ast-types.ast-types/lib/path-visitor.SharedContextMethods */
  @js.native
  trait Context extends StObject {
    
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
    var acquireContext_Original: js.Function1[/* path */ js.Any, js.Any] = js.native
    
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
    var visitWithoutReset_Original: js.Function1[/* path */ js.Any, js.Any] = js.native
    
    var visitor: js.Any = js.native
    
    def wasChangeReported(): js.Any = js.native
    @JSName("wasChangeReported")
    var wasChangeReported_Original: js.Function0[js.Any] = js.native
  }
  
  trait PathVisitor extends StObject {
    
    var AbortRequest: js.Any
    
    var Context: js.Any
    
    var _abortRequested: Boolean
    
    var _changeReported: js.Any
    
    var _methodNameTable: js.Any
    
    var _reusableContextStack: js.Any
    
    var _shouldVisitComments: js.Any
    
    var _visiting: js.Any
    
    def abort(): Unit
    
    def acquireContext(path: js.Any): js.Any
    
    def releaseContext(context: js.Any): Unit
    
    def reportChanged(): Unit
    
    def reset(args: js.Any*): js.Any
    
    def visit(args: js.Any*): js.Any
    
    def visitWithoutReset(path: js.Any): js.Any
    
    var visitor: js.Any
    
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
      val __obj = js.Dynamic.literal(AbortRequest = AbortRequest.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], _abortRequested = _abortRequested.asInstanceOf[js.Any], _changeReported = _changeReported.asInstanceOf[js.Any], _methodNameTable = _methodNameTable.asInstanceOf[js.Any], _reusableContextStack = _reusableContextStack.asInstanceOf[js.Any], _shouldVisitComments = _shouldVisitComments.asInstanceOf[js.Any], _visiting = _visiting.asInstanceOf[js.Any], abort = js.Any.fromFunction0(abort), acquireContext = js.Any.fromFunction1(acquireContext), releaseContext = js.Any.fromFunction1(releaseContext), reportChanged = js.Any.fromFunction0(reportChanged), reset = js.Any.fromFunction1(reset), visit = js.Any.fromFunction1(visit), visitWithoutReset = js.Any.fromFunction1(visitWithoutReset), visitor = visitor.asInstanceOf[js.Any], wasChangeReported = js.Any.fromFunction0(wasChangeReported))
      __obj.asInstanceOf[PathVisitor]
    }
    
    @scala.inline
    implicit class PathVisitorMutableBuilder[Self <: PathVisitor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      @scala.inline
      def setAbortRequest(value: js.Any): Self = StObject.set(x, "AbortRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcquireContext(value: js.Any => js.Any): Self = StObject.set(x, "acquireContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseContext(value: js.Any => Unit): Self = StObject.set(x, "releaseContext", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReportChanged(value: () => Unit): Self = StObject.set(x, "reportChanged", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReset(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisit(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "visit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitWithoutReset(value: js.Any => js.Any): Self = StObject.set(x, "visitWithoutReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVisitor(value: js.Any): Self = StObject.set(x, "visitor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWasChangeReported(value: () => js.Any): Self = StObject.set(x, "wasChangeReported", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_abortRequested(value: Boolean): Self = StObject.set(x, "_abortRequested", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_changeReported(value: js.Any): Self = StObject.set(x, "_changeReported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_methodNameTable(value: js.Any): Self = StObject.set(x, "_methodNameTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_reusableContextStack(value: js.Any): Self = StObject.set(x, "_reusableContextStack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_shouldVisitComments(value: js.Any): Self = StObject.set(x, "_shouldVisitComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_visiting(value: js.Any): Self = StObject.set(x, "_visiting", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PathVisitorConstructor
    extends StObject
       with PathVisitorStatics
       with Instantiable0[PathVisitor]
  
  @js.native
  trait PathVisitorStatics extends StObject {
    
    def fromMethodsObject(): Visitor = js.native
    def fromMethodsObject(methods: js.Any): Visitor = js.native
    
    def visit[M](node: ASTNode): js.Any = js.native
    def visit[M](node: ASTNode, methods: typings.astTypes.visitorMod.Visitor[M]): js.Any = js.native
  }
  
  @js.native
  trait SharedContextMethods extends StObject {
    
    var Context: js.Any = js.native
    
    def abort(): Unit = js.native
    
    var currentPath: js.Any = js.native
    
    def invokeVisitorMethod(methodName: String): js.Any = js.native
    
    var needToCallTraverse: Boolean = js.native
    
    def reportChanged(): Unit = js.native
    
    def reset(path: js.Any, args: js.Any*): js.Any = js.native
    
    def traverse(path: js.Any): js.Any = js.native
    def traverse(path: js.Any, newVisitor: VisitorMethods): js.Any = js.native
    
    def visit(path: js.Any): js.Any = js.native
    def visit(path: js.Any, newVisitor: VisitorMethods): js.Any = js.native
    
    var visitor: js.Any = js.native
  }
  
  type Visitor = PathVisitor
  
  @js.native
  trait VisitorConstructor
    extends StObject
       with PathVisitorStatics
       with Instantiable0[Visitor]
  
  type VisitorMethods = StringDictionary[js.Function1[/* path */ NodePath[js.Any, js.Any], js.Any]]
}
