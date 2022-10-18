package typings.angularCompilerCli

import typings.typescript.mod.ClassDeclaration
import typings.typescript.mod.Node
import typings.typescript.mod.Statement
import typings.typescript.mod.TransformationContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscUtilSrcVisitorMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/util/src/visitor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("@angular/compiler-cli/src/ngtsc/util/src/visitor", "Visitor")
  @js.native
  open class Visitor () extends StObject {
    
    /**
      * Maps statements to an array of statements that should be inserted after them.
      */
    /* private */ var _after: Any = js.native
    
    /**
      * Maps statements to an array of statements that should be inserted before them.
      */
    /* private */ var _before: Any = js.native
    
    /* private */ var _maybeProcessStatements: Any = js.native
    
    /* private */ var _visitListEntryNode: Any = js.native
    
    /**
      * Visit a class declaration, returning at least the transformed declaration and optionally other
      * nodes to insert before the declaration.
      */
    def visitClassDeclaration(node: ClassDeclaration): VisitListEntryResult[Statement, ClassDeclaration] = js.native
    
    /**
      * Visit types of nodes which don't have their own explicit visitor.
      */
    def visitOtherNode[T /* <: Node */](node: T): T = js.native
  }
  
  inline def visit[T /* <: Node */](node: T, visitor: Visitor, context: TransformationContext): T = (^.asInstanceOf[js.Dynamic].applyDynamic("visit")(node.asInstanceOf[js.Any], visitor.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[T]
  
  trait VisitListEntryResult[B /* <: Node */, T /* <: B */] extends StObject {
    
    var after: js.UndefOr[js.Array[B]] = js.undefined
    
    var before: js.UndefOr[js.Array[B]] = js.undefined
    
    var node: T
  }
  object VisitListEntryResult {
    
    inline def apply[B /* <: Node */, T /* <: B */](node: T): VisitListEntryResult[B, T] = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
      __obj.asInstanceOf[VisitListEntryResult[B, T]]
    }
    
    extension [Self <: VisitListEntryResult[?, ?], B /* <: Node */, T /* <: B */](x: Self & (VisitListEntryResult[B, T])) {
      
      inline def setAfter(value: js.Array[B]): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setAfterVarargs(value: B*): Self = StObject.set(x, "after", js.Array(value*))
      
      inline def setBefore(value: js.Array[B]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(value: B*): Self = StObject.set(x, "before", js.Array(value*))
      
      inline def setNode(value: T): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    }
  }
}
