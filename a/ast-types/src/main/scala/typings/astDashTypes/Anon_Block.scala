package typings.astDashTypes

import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.CatchClauseKind
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends js.Object {
  var block: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var finalizer: js.UndefOr[BlockStatementKind | Null] = js.undefined
  var guardedHandlers: js.UndefOr[js.Array[CatchClauseKind]] = js.undefined
  var handler: js.UndefOr[CatchClauseKind | Null] = js.undefined
  var handlers: js.UndefOr[js.Array[CatchClauseKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_Block {
  @scala.inline
  def apply(
    block: BlockStatementKind,
    comments: js.Array[CommentKind] = null,
    finalizer: BlockStatementKind = null,
    guardedHandlers: js.Array[CatchClauseKind] = null,
    handler: CatchClauseKind = null,
    handlers: js.Array[CatchClauseKind] = null,
    loc: SourceLocationKind = null
  ): Anon_Block = {
    val __obj = js.Dynamic.literal(block = block)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (finalizer != null) __obj.updateDynamic("finalizer")(finalizer)
    if (guardedHandlers != null) __obj.updateDynamic("guardedHandlers")(guardedHandlers)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (handlers != null) __obj.updateDynamic("handlers")(handlers)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_Block]
  }
}

