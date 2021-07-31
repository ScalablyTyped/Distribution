package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSThisTypeKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Asserts extends StObject {
  
  var asserts: js.UndefOr[Boolean] = js.undefined
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var parameterName: IdentifierKind | TSThisTypeKind
  
  var typeAnnotation: js.UndefOr[TSTypeAnnotationKind | Null] = js.undefined
}
object Asserts {
  
  @scala.inline
  def apply(parameterName: IdentifierKind | TSThisTypeKind): Asserts = {
    val __obj = js.Dynamic.literal(parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Asserts]
  }
  
  @scala.inline
  implicit class AssertsMutableBuilder[Self <: Asserts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsserts(value: Boolean): Self = StObject.set(x, "asserts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssertsUndefined: Self = StObject.set(x, "asserts", js.undefined)
    
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
    def setParameterName(value: IdentifierKind | TSThisTypeKind): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TSTypeAnnotationKind): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
