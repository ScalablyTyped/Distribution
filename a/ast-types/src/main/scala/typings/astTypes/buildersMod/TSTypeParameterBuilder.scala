package typings.astTypes.buildersMod

import typings.astTypes.AnonCommentsConstraint
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.namedTypesMod.namedTypes.TSTypeParameter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterBuilder extends js.Object {
  def apply(name: String): TSTypeParameter = js.native
  def apply(name: String, constraint: js.UndefOr[scala.Nothing], defaultParam: TSTypeKind): TSTypeParameter = js.native
  def apply(name: String, constraint: TSTypeKind): TSTypeParameter = js.native
  def apply(name: String, constraint: TSTypeKind, defaultParam: TSTypeKind): TSTypeParameter = js.native
  def from(params: AnonCommentsConstraint): TSTypeParameter = js.native
}

