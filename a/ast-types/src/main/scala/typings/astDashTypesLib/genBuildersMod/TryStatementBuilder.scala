package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TryStatementBuilder extends js.Object {
  def apply(block: astDashTypesLib.genKindsMod.BlockStatementKind): astDashTypesLib.genNamedTypesMod.namedTypesNs.TryStatement = js.native
  def apply(
    block: astDashTypesLib.genKindsMod.BlockStatementKind,
    handler: astDashTypesLib.genKindsMod.CatchClauseKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TryStatement = js.native
  def apply(
    block: astDashTypesLib.genKindsMod.BlockStatementKind,
    handler: astDashTypesLib.genKindsMod.CatchClauseKind,
    finalizer: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TryStatement = js.native
  def apply(
    block: astDashTypesLib.genKindsMod.BlockStatementKind,
    handler: scala.Null,
    finalizer: astDashTypesLib.genKindsMod.BlockStatementKind
  ): astDashTypesLib.genNamedTypesMod.namedTypesNs.TryStatement = js.native
  def from(params: astDashTypesLib.Anon_Block): astDashTypesLib.genNamedTypesMod.namedTypesNs.TryStatement = js.native
}

