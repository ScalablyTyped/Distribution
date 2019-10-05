package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_Body
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.Program
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgramBuilder extends js.Object {
  def apply(body: js.Array[StatementKind]): Program = js.native
  def from(params: Anon_Body): Program = js.native
}

