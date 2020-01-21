package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdLocArray
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.PrivateName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateNameBuilder extends js.Object {
  def apply(id: IdentifierKind): PrivateName = js.native
  def from(params: AnonCommentsIdLocArray): PrivateName = js.native
}

