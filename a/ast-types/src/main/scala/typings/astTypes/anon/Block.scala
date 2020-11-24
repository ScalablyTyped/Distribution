package typings.astTypes.anon

import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.CatchClauseKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends js.Object {
  
  var block: BlockStatementKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var finalizer: js.UndefOr[BlockStatementKind | Null] = js.native
  
  var guardedHandlers: js.UndefOr[js.Array[CatchClauseKind]] = js.native
  
  var handler: js.UndefOr[CatchClauseKind | Null] = js.native
  
  var handlers: js.UndefOr[js.Array[CatchClauseKind]] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
}
object Block {
  
  @scala.inline
  def apply(block: BlockStatementKind): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit class BlockOps[Self <: Block] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlock(value: BlockStatementKind): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCommentsNull: Self = this.set("comments", null)
    
    @scala.inline
    def setFinalizer(value: BlockStatementKind): Self = this.set("finalizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalizer: Self = this.set("finalizer", js.undefined)
    
    @scala.inline
    def setFinalizerNull: Self = this.set("finalizer", null)
    
    @scala.inline
    def setGuardedHandlersVarargs(value: CatchClauseKind*): Self = this.set("guardedHandlers", js.Array(value :_*))
    
    @scala.inline
    def setGuardedHandlers(value: js.Array[CatchClauseKind]): Self = this.set("guardedHandlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuardedHandlers: Self = this.set("guardedHandlers", js.undefined)
    
    @scala.inline
    def setHandler(value: CatchClauseKind): Self = this.set("handler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setHandlerNull: Self = this.set("handler", null)
    
    @scala.inline
    def setHandlersVarargs(value: CatchClauseKind*): Self = this.set("handlers", js.Array(value :_*))
    
    @scala.inline
    def setHandlers(value: js.Array[CatchClauseKind]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    
    @scala.inline
    def setLocNull: Self = this.set("loc", null)
  }
}
