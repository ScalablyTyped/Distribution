package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdLocArray
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.DeclareVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareVariableBuilder extends js.Object {
  def apply(id: IdentifierKind): DeclareVariable = js.native
  def from(params: AnonCommentsIdLocArray): DeclareVariable = js.native
}

