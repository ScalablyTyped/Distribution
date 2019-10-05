package typings.astDashTypes.genBuildersMod

import typings.astDashTypes.Anon_CommentsConstraint
import typings.astDashTypes.genKindsMod.TSTypeKind
import typings.astDashTypes.genNamedTypesMod.namedTypes.TSTypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterBuilder extends js.Object {
  def apply(name: String): TSTypeParameter = js.native
  def apply(name: String, constraint: js.UndefOr[scala.Nothing], defaultParam: TSTypeKind): TSTypeParameter = js.native
  def apply(name: String, constraint: TSTypeKind): TSTypeParameter = js.native
  def apply(name: String, constraint: TSTypeKind, defaultParam: TSTypeKind): TSTypeParameter = js.native
  def from(params: Anon_CommentsConstraint): TSTypeParameter = js.native
}

