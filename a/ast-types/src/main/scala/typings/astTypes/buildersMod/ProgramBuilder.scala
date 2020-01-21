package typings.astTypes.buildersMod

import typings.astTypes.AnonBody
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.namedTypesMod.namedTypes.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgramBuilder extends js.Object {
  def apply(body: js.Array[StatementKind]): Program = js.native
  def from(params: AnonBody): Program = js.native
}

