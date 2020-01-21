package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsIdLocArray
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.namedTypesMod.namedTypes.DeclareFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareFunctionBuilder extends js.Object {
  def apply(id: IdentifierKind): DeclareFunction = js.native
  def from(params: AnonCommentsIdLocArray): DeclareFunction = js.native
}

