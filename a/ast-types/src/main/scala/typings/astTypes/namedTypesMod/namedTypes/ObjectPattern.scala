package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.DecoratorKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.ObjectPropertyKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.PropertyKind
import typings.astTypes.kindsMod.PropertyPatternKind
import typings.astTypes.kindsMod.RestPropertyKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.SpreadPropertyKind
import typings.astTypes.kindsMod.SpreadPropertyPatternKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> */
trait ObjectPattern
  extends StObject
     with ASTNode
     with NodeKind
     with PatternKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var properties: js.Array[
    PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
  ]
  
  var `type`: typings.astTypes.astTypesStrings.ObjectPattern
  
  var typeAnnotation: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
}
object ObjectPattern {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectPattern")
  @js.native
  val ^ : Type[ObjectPattern] = js.native
  
  @scala.inline
  implicit class ObjectPatternMutableBuilder[Self <: ObjectPattern] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setDecorators(value: js.Array[DecoratorKind]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(value: DecoratorKind*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setProperties(
      value: js.Array[
          PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
        ]
    ): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesVarargs(
      value: (PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind)*
    ): Self = StObject.set(x, "properties", js.Array(value :_*))
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.ObjectPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotationKind | TSTypeAnnotationKind): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
