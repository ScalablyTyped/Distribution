package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.astTypesStrings.`private`
import typings.astTypes.astTypesStrings.`protected`
import typings.astTypes.astTypesStrings.public
import typings.astTypes.kindsMod.AssignmentPatternKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> */
trait TSParameterProperty
  extends StObject
     with ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.undefined
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var parameter: IdentifierKind | AssignmentPatternKind
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.TSParameterProperty
}
object TSParameterProperty {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSParameterProperty")
  @js.native
  val ^ : Type[TSParameterProperty] = js.native
  
  @scala.inline
  implicit class TSParameterPropertyMutableBuilder[Self <: TSParameterProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: public | `private` | `protected`): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setParameter(value: IdentifierKind | AssignmentPatternKind): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.TSParameterProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
