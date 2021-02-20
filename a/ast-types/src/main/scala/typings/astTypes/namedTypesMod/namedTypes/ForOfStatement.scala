package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.VariableDeclarationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Statement, 'type'> */
@js.native
trait ForOfStatement
  extends ASTNode
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var await: js.UndefOr[Boolean] = js.native
  
  var body: StatementKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var left: VariableDeclarationKind | PatternKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var right: ExpressionKind = js.native
  
  var `type`: typings.astTypes.astTypesStrings.ForOfStatement = js.native
}
object ForOfStatement {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ForOfStatement")
  @js.native
  val ^ : Type[ForOfStatement] = js.native
  
  @scala.inline
  implicit class ForOfStatementMutableBuilder[Self <: ForOfStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwait(value: Boolean): Self = StObject.set(x, "await", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwaitUndefined: Self = StObject.set(x, "await", js.undefined)
    
    @scala.inline
    def setBody(value: StatementKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLeft(value: VariableDeclarationKind | PatternKind): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setRight(value: ExpressionKind): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.ForOfStatement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
