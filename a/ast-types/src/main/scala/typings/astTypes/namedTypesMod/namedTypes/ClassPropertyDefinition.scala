package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.ClassPropertyDefinitionKind
import typings.astTypes.kindsMod.ClassPropertyKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.MethodDefinitionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.VariableDeclaratorKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
trait ClassPropertyDefinition
  extends StObject
     with ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var definition: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.ClassPropertyDefinition
}
object ClassPropertyDefinition {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ClassPropertyDefinition")
  @js.native
  val ^ : Type[ClassPropertyDefinition] = js.native
  
  @scala.inline
  implicit class ClassPropertyDefinitionMutableBuilder[Self <: ClassPropertyDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setDefinition(
      value: MethodDefinitionKind | VariableDeclaratorKind | ClassPropertyDefinitionKind | ClassPropertyKind
    ): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.ClassPropertyDefinition): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
