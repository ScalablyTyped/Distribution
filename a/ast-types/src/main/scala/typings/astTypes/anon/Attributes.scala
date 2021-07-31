package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.JSXAttributeKind
import typings.astTypes.kindsMod.JSXClosingElementKind
import typings.astTypes.kindsMod.JSXElementKind
import typings.astTypes.kindsMod.JSXExpressionContainerKind
import typings.astTypes.kindsMod.JSXFragmentKind
import typings.astTypes.kindsMod.JSXIdentifierKind
import typings.astTypes.kindsMod.JSXMemberExpressionKind
import typings.astTypes.kindsMod.JSXNamespacedNameKind
import typings.astTypes.kindsMod.JSXOpeningElementKind
import typings.astTypes.kindsMod.JSXSpreadAttributeKind
import typings.astTypes.kindsMod.JSXSpreadChildKind
import typings.astTypes.kindsMod.JSXTextKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attributes extends StObject {
  
  var attributes: js.UndefOr[js.Array[JSXAttributeKind | JSXSpreadAttributeKind]] = js.undefined
  
  var children: js.UndefOr[
    js.Array[
      JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
    ]
  ] = js.undefined
  
  var closingElement: js.UndefOr[JSXClosingElementKind | Null] = js.undefined
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var name: js.UndefOr[JSXIdentifierKind | JSXNamespacedNameKind | JSXMemberExpressionKind] = js.undefined
  
  var openingElement: JSXOpeningElementKind
  
  var selfClosing: js.UndefOr[Boolean] = js.undefined
}
object Attributes {
  
  @scala.inline
  def apply(openingElement: JSXOpeningElementKind): Attributes = {
    val __obj = js.Dynamic.literal(openingElement = openingElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesMutableBuilder[Self <: Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[JSXAttributeKind | JSXSpreadAttributeKind]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: (JSXAttributeKind | JSXSpreadAttributeKind)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setChildren(
      value: js.Array[
          JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(
      value: (JSXTextKind | JSXExpressionContainerKind | JSXSpreadChildKind | JSXElementKind | JSXFragmentKind | LiteralKind)*
    ): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setClosingElement(value: JSXClosingElementKind): Self = StObject.set(x, "closingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosingElementNull: Self = StObject.set(x, "closingElement", null)
    
    @scala.inline
    def setClosingElementUndefined: Self = StObject.set(x, "closingElement", js.undefined)
    
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
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpeningElement(value: JSXOpeningElementKind): Self = StObject.set(x, "openingElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
  }
}
