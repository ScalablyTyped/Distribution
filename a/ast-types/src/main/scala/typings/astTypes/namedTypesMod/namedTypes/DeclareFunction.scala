package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.FlowPredicateKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
trait DeclareFunction
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var id: IdentifierKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var predicate: js.UndefOr[FlowPredicateKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.DeclareFunction
}
object DeclareFunction {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.DeclareFunction")
  @js.native
  val ^ : Type[DeclareFunction] = js.native
  
  @scala.inline
  implicit class DeclareFunctionMutableBuilder[Self <: DeclareFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setPredicate(value: FlowPredicateKind): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicateNull: Self = StObject.set(x, "predicate", null)
    
    @scala.inline
    def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.DeclareFunction): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
