package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.FlowKind
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.InterfaceExtendsKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.ObjectTypeAnnotationKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.FlowType, 'type'> */
trait InterfaceTypeAnnotation
  extends StObject
     with ASTNode
     with FlowKind
     with FlowTypeKind
     with NodeKind
     with PrintableKind {
  
  var body: ObjectTypeAnnotationKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var `extends`: js.UndefOr[js.Array[InterfaceExtendsKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.InterfaceTypeAnnotation
}
object InterfaceTypeAnnotation {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.InterfaceTypeAnnotation")
  @js.native
  val ^ : Type[InterfaceTypeAnnotation] = js.native
  
  extension [Self <: InterfaceTypeAnnotation](x: Self) {
    
    inline def setBody(value: ObjectTypeAnnotationKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setExtends(value: js.Array[InterfaceExtendsKind]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setExtendsVarargs(value: InterfaceExtendsKind*): Self = StObject.set(x, "extends", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setType(value: typings.astTypes.astTypesStrings.InterfaceTypeAnnotation): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
