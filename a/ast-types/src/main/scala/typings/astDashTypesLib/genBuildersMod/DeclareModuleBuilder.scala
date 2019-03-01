package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeclareModuleBuilder extends js.Object {
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    body: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNodesMod.DeclareModule = js.native
  def apply(id: astDashTypesLib.genKindsMod.LiteralKind, body: astDashTypesLib.genKindsMod.BlockStatementKind): astDashTypesLib.genNodesMod.DeclareModule = js.native
  def from(params: astDashTypesLib.Anon_BodyCommentsIdLoc): astDashTypesLib.genNodesMod.DeclareModule = js.native
}

