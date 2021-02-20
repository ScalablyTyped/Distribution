package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.DirectiveKind
import typings.astTypes.kindsMod.InterpreterDirectiveKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
@js.native
trait Program
  extends ASTNode
     with NodeKind
     with PrintableKind {
  
  var body: js.Array[StatementKind] = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var directives: js.UndefOr[js.Array[DirectiveKind]] = js.native
  
  var interpreter: js.UndefOr[InterpreterDirectiveKind | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var `type`: typings.astTypes.astTypesStrings.Program = js.native
}
object Program {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.Program")
  @js.native
  val ^ : Type[Program] = js.native
  
  @scala.inline
  implicit class ProgramMutableBuilder[Self <: Program] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[StatementKind]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: StatementKind*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setDirectives(value: js.Array[DirectiveKind]): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectivesUndefined: Self = StObject.set(x, "directives", js.undefined)
    
    @scala.inline
    def setDirectivesVarargs(value: DirectiveKind*): Self = StObject.set(x, "directives", js.Array(value :_*))
    
    @scala.inline
    def setInterpreter(value: InterpreterDirectiveKind): Self = StObject.set(x, "interpreter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpreterNull: Self = StObject.set(x, "interpreter", null)
    
    @scala.inline
    def setInterpreterUndefined: Self = StObject.set(x, "interpreter", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.Program): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
