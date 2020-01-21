package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsFlags
import typings.astTypes.namedTypesMod.namedTypes.RegExpLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegExpLiteralBuilder extends js.Object {
  def apply(pattern: String, flags: String): RegExpLiteral = js.native
  def from(params: AnonCommentsFlags): RegExpLiteral = js.native
}

