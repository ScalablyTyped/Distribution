package typings.astTypes.buildersMod

import typings.astTypes.AnonComments
import typings.astTypes.kindsMod.ProgramKind
import typings.astTypes.namedTypesMod.namedTypes.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileBuilder extends js.Object {
  def apply(program: ProgramKind): File = js.native
  def apply(program: ProgramKind, name: String): File = js.native
  def from(params: AnonComments): File = js.native
}

