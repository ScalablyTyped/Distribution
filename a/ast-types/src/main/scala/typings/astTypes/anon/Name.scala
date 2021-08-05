package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.JSXElementKind
import typings.astTypes.kindsMod.JSXExpressionContainerKind
import typings.astTypes.kindsMod.JSXFragmentKind
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.kindsMod.JSXNamespacedNameKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var name: JSXIdentifierKind | JSXNamespacedNameKind
  
  var value: js.UndefOr[
    LiteralKind | JSXExpressionContainerKind | JSXElementKind | JSXFragmentKind | Null
  ] = js.undefined
}
object Name {
  
  inline def apply(name: JSXIdentifierKind | JSXNamespacedNameKind): Name = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Name]
  }
  
  extension [Self <: Name](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setName(value: JSXIdentifierKind | JSXNamespacedNameKind): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: LiteralKind | JSXExpressionContainerKind | JSXElementKind | JSXFragmentKind): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
