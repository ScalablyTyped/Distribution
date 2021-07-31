package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.ExportBatchSpecifierKind
import typings.astTypes.kindsMod.ExportSpecifierKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.LiteralKind
import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Specifiers extends StObject {
  
  var default: Boolean
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var declaration: DeclarationKind | ExpressionKind | Null
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var source: js.UndefOr[LiteralKind | Null] = js.undefined
  
  var specifiers: js.UndefOr[js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]] = js.undefined
}
object Specifiers {
  
  @scala.inline
  def apply(default: Boolean): Specifiers = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], declaration = null)
    __obj.asInstanceOf[Specifiers]
  }
  
  @scala.inline
  implicit class SpecifiersMutableBuilder[Self <: Specifiers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setDeclaration(value: DeclarationKind | ExpressionKind): Self = StObject.set(x, "declaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclarationNull: Self = StObject.set(x, "declaration", null)
    
    @scala.inline
    def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setSource(value: LiteralKind): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceNull: Self = StObject.set(x, "source", null)
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setSpecifiers(value: js.Array[ExportSpecifierKind | ExportBatchSpecifierKind]): Self = StObject.set(x, "specifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecifiersUndefined: Self = StObject.set(x, "specifiers", js.undefined)
    
    @scala.inline
    def setSpecifiersVarargs(value: (ExportSpecifierKind | ExportBatchSpecifierKind)*): Self = StObject.set(x, "specifiers", js.Array(value :_*))
  }
}
