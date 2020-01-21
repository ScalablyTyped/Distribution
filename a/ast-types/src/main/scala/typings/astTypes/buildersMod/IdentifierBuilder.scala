package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsLoc
import typings.astTypes.namedTypesMod.namedTypes.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IdentifierBuilder extends js.Object {
  def apply(name: String): Identifier = js.native
  def from(params: AnonCommentsLoc): Identifier = js.native
}

