package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.TSType, 'type'> */
trait TSUnionType
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.TSUnionType
  
  var types: js.Array[TSTypeKind]
}
object TSUnionType {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSUnionType")
  @js.native
  val ^ : Type[TSUnionType] = js.native
  
  extension [Self <: TSUnionType](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setType(value: typings.astTypes.astTypesStrings.TSUnionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[TSTypeKind]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: TSTypeKind*): Self = StObject.set(x, "types", js.Array(value :_*))
  }
}
