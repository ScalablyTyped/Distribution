package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSDeclareFunctionBuilder extends js.Object {
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind | js.UndefOr[scala.Nothing],
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind]
  ): astDashTypesLib.genNodesMod.TSDeclareFunction = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind | js.UndefOr[scala.Nothing],
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    returnType: astDashTypesLib.genKindsMod.NoopKind
  ): astDashTypesLib.genNodesMod.TSDeclareFunction = js.native
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind | js.UndefOr[scala.Nothing],
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    returnType: astDashTypesLib.genKindsMod.TSTypeAnnotationKind
  ): astDashTypesLib.genNodesMod.TSDeclareFunction = js.native
  def apply(id: scala.Null, params: js.Array[astDashTypesLib.genKindsMod.PatternKind]): astDashTypesLib.genNodesMod.TSDeclareFunction = js.native
  def apply(
    id: scala.Null,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    returnType: astDashTypesLib.genKindsMod.NoopKind
  ): astDashTypesLib.genNodesMod.TSDeclareFunction = js.native
  def apply(
    id: scala.Null,
    params: js.Array[astDashTypesLib.genKindsMod.PatternKind],
    returnType: astDashTypesLib.genKindsMod.TSTypeAnnotationKind
  ): astDashTypesLib.genNodesMod.TSDeclareFunction = js.native
  def from(params: astDashTypesLib.Anon_AsyncComments): astDashTypesLib.genNodesMod.TSDeclareFunction = js.native
}

