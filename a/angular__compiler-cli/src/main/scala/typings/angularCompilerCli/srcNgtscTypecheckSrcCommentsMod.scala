package typings.angularCompilerCli

import typings.angularCompiler.mod.AbsoluteSourceSpan
import typings.angularCompiler.mod.ParseSourceSpan
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscTypecheckSrcCommentsMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/comments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait CommentTriviaType extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/comments", "CommentTriviaType")
  @js.native
  object CommentTriviaType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[CommentTriviaType & String] = js.native
    
    @js.native
    sealed trait DIAGNOSTIC
      extends StObject
         with CommentTriviaType
    /* "D" */ val DIAGNOSTIC: typings.angularCompilerCli.srcNgtscTypecheckSrcCommentsMod.CommentTriviaType.DIAGNOSTIC & String = js.native
    
    @js.native
    sealed trait EXPRESSION_TYPE_IDENTIFIER
      extends StObject
         with CommentTriviaType
    /* "T" */ val EXPRESSION_TYPE_IDENTIFIER: typings.angularCompilerCli.srcNgtscTypecheckSrcCommentsMod.CommentTriviaType.EXPRESSION_TYPE_IDENTIFIER & String = js.native
  }
  
  @js.native
  sealed trait ExpressionIdentifier extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/typecheck/src/comments", "ExpressionIdentifier")
  @js.native
  object ExpressionIdentifier extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ExpressionIdentifier & String] = js.native
    
    @js.native
    sealed trait COMPONENT_COMPLETION
      extends StObject
         with ExpressionIdentifier
    /* "COMPCOMP" */ val COMPONENT_COMPLETION: typings.angularCompilerCli.srcNgtscTypecheckSrcCommentsMod.ExpressionIdentifier.COMPONENT_COMPLETION & String = js.native
    
    @js.native
    sealed trait DIRECTIVE
      extends StObject
         with ExpressionIdentifier
    /* "DIR" */ val DIRECTIVE: typings.angularCompilerCli.srcNgtscTypecheckSrcCommentsMod.ExpressionIdentifier.DIRECTIVE & String = js.native
    
    @js.native
    sealed trait EVENT_PARAMETER
      extends StObject
         with ExpressionIdentifier
    /* "EP" */ val EVENT_PARAMETER: typings.angularCompilerCli.srcNgtscTypecheckSrcCommentsMod.ExpressionIdentifier.EVENT_PARAMETER & String = js.native
  }
  
  inline def addExpressionIdentifier(node: Node, identifier: ExpressionIdentifier): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExpressionIdentifier")(node.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findAllMatchingNodes[T /* <: Node */](tcb: Node, opts: FindOptions[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("findAllMatchingNodes")(tcb.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def findFirstMatchingNode[T /* <: Node */](tcb: Node, opts: FindOptions[T]): T | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findFirstMatchingNode")(tcb.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[T | Null]
  
  inline def hasExpressionIdentifier(sourceFile: SourceFile, node: Node, identifier: ExpressionIdentifier): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasExpressionIdentifier")(sourceFile.asInstanceOf[js.Any], node.asInstanceOf[js.Any], identifier.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasIgnoreForDiagnosticsMarker(node: Node, sourceFile: SourceFile): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasIgnoreForDiagnosticsMarker")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def markIgnoreDiagnostics(node: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markIgnoreDiagnostics")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def readSpanComment(node: Node): AbsoluteSourceSpan | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("readSpanComment")(node.asInstanceOf[js.Any]).asInstanceOf[AbsoluteSourceSpan | Null]
  inline def readSpanComment(node: Node, sourceFile: SourceFile): AbsoluteSourceSpan | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readSpanComment")(node.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any])).asInstanceOf[AbsoluteSourceSpan | Null]
  
  trait FindOptions[T /* <: Node */] extends StObject {
    
    def filter(node: Node): /* is T */ Boolean
    
    var withExpressionIdentifier: js.UndefOr[ExpressionIdentifier] = js.undefined
    
    var withSpan: js.UndefOr[AbsoluteSourceSpan | ParseSourceSpan] = js.undefined
  }
  object FindOptions {
    
    inline def apply[T /* <: Node */](filter: Node => /* is T */ Boolean): FindOptions[T] = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter))
      __obj.asInstanceOf[FindOptions[T]]
    }
    
    extension [Self <: FindOptions[?], T /* <: Node */](x: Self & FindOptions[T]) {
      
      inline def setFilter(value: Node => /* is T */ Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setWithExpressionIdentifier(value: ExpressionIdentifier): Self = StObject.set(x, "withExpressionIdentifier", value.asInstanceOf[js.Any])
      
      inline def setWithExpressionIdentifierUndefined: Self = StObject.set(x, "withExpressionIdentifier", js.undefined)
      
      inline def setWithSpan(value: AbsoluteSourceSpan | ParseSourceSpan): Self = StObject.set(x, "withSpan", value.asInstanceOf[js.Any])
      
      inline def setWithSpanUndefined: Self = StObject.set(x, "withSpan", js.undefined)
    }
  }
}
