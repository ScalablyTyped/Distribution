package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.JSXElementKind
import typings.astTypes.kindsMod.JSXExpressionContainerKind
import typings.astTypes.kindsMod.JSXFragmentKind
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.kindsMod.JSXNamespacedNameKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait JSXAttribute
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var name: JSXIdentifierKind | JSXNamespacedNameKind
  
  var `type`: typings.astTypes.astTypesStrings.JSXAttribute
  
  var value: js.UndefOr[
    LiteralKind | JSXExpressionContainerKind | JSXElementKind | JSXFragmentKind | Null
  ] = js.undefined
}
object JSXAttribute {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.JSXAttribute")
  @js.native
  val ^ : Type[JSXAttribute] = js.native
  
  extension [Self <: JSXAttribute](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setName(value: JSXIdentifierKind | JSXNamespacedNameKind): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.astTypes.astTypesStrings.JSXAttribute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: LiteralKind | JSXExpressionContainerKind | JSXElementKind | JSXFragmentKind): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
