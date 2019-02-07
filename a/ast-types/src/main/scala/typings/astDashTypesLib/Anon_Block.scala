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

