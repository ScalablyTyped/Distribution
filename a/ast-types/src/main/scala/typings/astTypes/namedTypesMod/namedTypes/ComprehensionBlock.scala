package typings.astTypes.namedTypesMod.namedTypes

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
trait ComprehensionBlock
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var each: Boolean
  
  var left: PatternKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var right: ExpressionKind
  
  var `type`: typings.astTypes.astTypesStrings.ComprehensionBlock
}
object ComprehensionBlock {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ComprehensionBlock")
  @js.native
  val ^ : Type[ComprehensionBlock] = js.native
  
  @scala.inline
  implicit class ComprehensionBlockMutableBuilder[Self <: ComprehensionBlock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setEach(value: Boolean): Self = StObject.set(x, "each", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: PatternKind): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setRight(value: ExpressionKind): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.ComprehensionBlock): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
