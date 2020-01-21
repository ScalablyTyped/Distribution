package typings.acorn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acorn", "TokContext")
@js.native
class TokContext protected () extends js.Object {
  def this(
    token: String,
    isExpr: Boolean,
    preserveSpace: Boolean,
    `override`: js.Function1[/* p */ Parser, Unit]
  ) = this()
}

