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
trait TSConditionalType
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind
     with TSTypeKind {
  
  var checkType: TSTypeKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var extendsType: TSTypeKind
  
  var falseType: TSTypeKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var trueType: TSTypeKind
  
  var `type`: typings.astTypes.astTypesStrings.TSConditionalType
}
object TSConditionalType {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSConditionalType")
  @js.native
  val ^ : Type[TSConditionalType] = js.native
  
  extension [Self <: TSConditionalType](x: Self) {
    
    inline def setCheckType(value: TSTypeKind): Self = StObject.set(x, "checkType", value.asInstanceOf[js.Any])
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setExtendsType(value: TSTypeKind): Self = StObject.set(x, "extendsType", value.asInstanceOf[js.Any])
    
    inline def setFalseType(value: TSTypeKind): Self = StObject.set(x, "falseType", value.asInstanceOf[js.Any])
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setTrueType(value: TSTypeKind): Self = StObject.set(x, "trueType", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.astTypes.astTypesStrings.TSConditionalType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
