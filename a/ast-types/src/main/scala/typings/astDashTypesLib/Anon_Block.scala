package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Block extends js.Object {
  var block: astDashTypesLib.genKindsMod.BlockStatementKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var finalizer: js.UndefOr[astDashTypesLib.genKindsMod.BlockStatementKind | scala.Null] = js.undefined
  var guardedHandlers: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CatchClauseKind]] = js.undefined
  var handler: js.UndefOr[astDashTypesLib.genKindsMod.CatchClauseKind | scala.Null] = js.undefined
  var handlers: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CatchClauseKind]] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_Block {
  @scala.inline
  def apply(
    block: astDashTypesLib.genKindsMod.BlockStatementKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    finalizer: astDashTypesLib.genKindsMod.BlockStatementKind = null,
    guardedHandlers: js.Array[astDashTypesLib.genKindsMod.CatchClauseKind] = null,
    handler: astDashTypesLib.genKindsMod.CatchClauseKind = null,
    handlers: js.Array[astDashTypesLib.genKindsMod.CatchClauseKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_Block = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("block")(block)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (finalizer != null) __obj.updateDynamic("finalizer")(finalizer)
    if (guardedHandlers != null) __obj.updateDynamic("guardedHandlers")(guardedHandlers)
    if (handler != null) __obj.updateDynamic("handler")(handler)
    if (handlers != null) __obj.updateDynamic("handlers")(handlers)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_Block]
  }
}

