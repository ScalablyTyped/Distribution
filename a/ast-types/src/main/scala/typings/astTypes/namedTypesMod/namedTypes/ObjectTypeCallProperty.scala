package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.FunctionTypeAnnotationKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait ObjectTypeCallProperty
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var static: js.UndefOr[Boolean] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.ObjectTypeCallProperty
  
  var value: FunctionTypeAnnotationKind
}
object ObjectTypeCallProperty {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectTypeCallProperty")
  @js.native
  val ^ : Type[ObjectTypeCallProperty] = js.native
  
  @scala.inline
  implicit class ObjectTypeCallPropertyMutableBuilder[Self <: ObjectTypeCallProperty] (val x: Self) extends AnyVal {
    
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
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.ObjectTypeCallProperty): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FunctionTypeAnnotationKind): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
