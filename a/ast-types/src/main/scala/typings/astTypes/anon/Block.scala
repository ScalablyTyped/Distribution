package typings.astTypes.anon

import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.CatchClauseKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.SourceLocationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  var block: BlockStatementKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var finalizer: js.UndefOr[BlockStatementKind | Null] = js.undefined
  
  var guardedHandlers: js.UndefOr[js.Array[CatchClauseKind]] = js.undefined
  
  var handler: js.UndefOr[CatchClauseKind | Null] = js.undefined
  
  var handlers: js.UndefOr[js.Array[CatchClauseKind]] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}
object Block {
  
  inline def apply(block: BlockStatementKind): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  extension [Self <: Block](x: Self) {
    
    inline def setBlock(value: BlockStatementKind): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setFinalizer(value: BlockStatementKind): Self = StObject.set(x, "finalizer", value.asInstanceOf[js.Any])
    
    inline def setFinalizerNull: Self = StObject.set(x, "finalizer", null)
    
    inline def setFinalizerUndefined: Self = StObject.set(x, "finalizer", js.undefined)
    
    inline def setGuardedHandlers(value: js.Array[CatchClauseKind]): Self = StObject.set(x, "guardedHandlers", value.asInstanceOf[js.Any])
    
    inline def setGuardedHandlersUndefined: Self = StObject.set(x, "guardedHandlers", js.undefined)
    
    inline def setGuardedHandlersVarargs(value: CatchClauseKind*): Self = StObject.set(x, "guardedHandlers", js.Array(value :_*))
    
    inline def setHandler(value: CatchClauseKind): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setHandlerNull: Self = StObject.set(x, "handler", null)
    
    inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
    
    inline def setHandlers(value: js.Array[CatchClauseKind]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    inline def setHandlersVarargs(value: CatchClauseKind*): Self = StObject.set(x, "handlers", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
  }
}
