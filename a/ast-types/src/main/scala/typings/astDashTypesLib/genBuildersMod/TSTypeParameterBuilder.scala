package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSTypeParameterBuilder extends js.Object {
  def apply(name: java.lang.String): astDashTypesLib.genNodesMod.TSTypeParameter = js.native
  def apply(name: java.lang.String, constraint: astDashTypesLib.genKindsMod.TSTypeKind): astDashTypesLib.genNodesMod.TSTypeParameter = js.native
  def apply(
    name: java.lang.String,
    constraint: astDashTypesLib.genKindsMod.TSTypeKind,
    defaultParam: astDashTypesLib.genKindsMod.TSTypeKind
  ): astDashTypesLib.genNodesMod.TSTypeParameter = js.native
  def apply(
    name: java.lang.String,
    constraint: js.UndefOr[scala.Nothing],
    defaultParam: astDashTypesLib.genKindsMod.TSTypeKind
  ): astDashTypesLib.genNodesMod.TSTypeParameter = js.native
  def from(params: astDashTypesLib.Anon_CommentsConstraint): astDashTypesLib.genNodesMod.TSTypeParameter = js.native
}

