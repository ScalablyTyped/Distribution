package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeParameterBuilder extends js.Object {
  def apply(name: java.lang.String): astDashTypesLib.genNodesMod.TypeParameter = js.native
  def apply(name: java.lang.String, variance: astDashTypesLib.astDashTypesLibStrings.minus): astDashTypesLib.genNodesMod.TypeParameter = js.native
  def apply(
    name: java.lang.String,
    variance: astDashTypesLib.astDashTypesLibStrings.minus,
    bound: astDashTypesLib.genKindsMod.TypeAnnotationKind
  ): astDashTypesLib.genNodesMod.TypeParameter = js.native
  def apply(name: java.lang.String, variance: astDashTypesLib.astDashTypesLibStrings.plus): astDashTypesLib.genNodesMod.TypeParameter = js.native
  def apply(
    name: java.lang.String,
    variance: astDashTypesLib.astDashTypesLibStrings.plus,
    bound: astDashTypesLib.genKindsMod.TypeAnnotationKind
  ): astDashTypesLib.genNodesMod.TypeParameter = js.native
  def apply(name: java.lang.String, variance: astDashTypesLib.genKindsMod.VarianceKind): astDashTypesLib.genNodesMod.TypeParameter = js.native
  def apply(
    name: java.lang.String,
    variance: astDashTypesLib.genKindsMod.VarianceKind,
    bound: astDashTypesLib.genKindsMod.TypeAnnotationKind
  ): astDashTypesLib.genNodesMod.TypeParameter = js.native
  def apply(
    name: java.lang.String,
    variance: scala.Null,
    bound: astDashTypesLib.genKindsMod.TypeAnnotationKind
  ): astDashTypesLib.genNodesMod.TypeParameter = js.native
  def from(params: astDashTypesLib.Anon_Bound): astDashTypesLib.genNodesMod.TypeParameter = js.native
}

