package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait CatchClause
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind {
  
  var body: BlockStatementKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var guard: js.UndefOr[ExpressionKind | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var param: js.UndefOr[PatternKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.CatchClause
}
object CatchClause {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.CatchClause")
  @js.native
  val ^ : Type[CatchClause] = js.native
  
  @scala.inline
  implicit class CatchClauseMutableBuilder[Self <: CatchClause] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatementKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setGuard(value: ExpressionKind): Self = StObject.set(x, "guard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuardNull: Self = StObject.set(x, "guard", null)
    
    @scala.inline
    def setGuardUndefined: Self = StObject.set(x, "guard", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setParam(value: PatternKind): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamNull: Self = StObject.set(x, "param", null)
    
    @scala.inline
    def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.CatchClause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
