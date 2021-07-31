package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.JSXAttributeKind
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.kindsMod.JSXMemberExpressionKind
import typings.astTypes.kindsMod.JSXNamespacedNameKind
import typings.astTypes.kindsMod.JSXSpreadAttributeKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
trait JSXOpeningElement
  extends StObject
     with ASTNode
     with NodeKind
     with PrintableKind {
  
  var attributes: js.UndefOr[js.Array[JSXAttributeKind | JSXSpreadAttributeKind]] = js.undefined
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var name: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind
  
  var selfClosing: js.UndefOr[Boolean] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.JSXOpeningElement
}
object JSXOpeningElement {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.JSXOpeningElement")
  @js.native
  val ^ : Type[JSXOpeningElement] = js.native
  
  @scala.inline
  implicit class JSXOpeningElementMutableBuilder[Self <: JSXOpeningElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: (JSXAttributeKind | JSXSpreadAttributeKind)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
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
    def setName(value: JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.JSXOpeningElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
