package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ComprehensionBlockKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Blocks extends StObject {
  
  var blocks: js.Array[ComprehensionBlockKind]
  
  var body: ExpressionKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var filter: ExpressionKind | Null
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}
object Blocks {
  
  @scala.inline
  def apply(blocks: js.Array[ComprehensionBlockKind], body: ExpressionKind): Blocks = {
    val __obj = js.Dynamic.literal(blocks = blocks.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], filter = null)
    __obj.asInstanceOf[Blocks]
  }
  
  @scala.inline
  implicit class BlocksMutableBuilder[Self <: Blocks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlocks(value: js.Array[ComprehensionBlockKind]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksVarargs(value: ComprehensionBlockKind*): Self = StObject.set(x, "blocks", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: ExpressionKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: ExpressionKind): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterNull: Self = StObject.set(x, "filter", null)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
