package typings
package astDashTypesLib.genBuildersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TSConditionalTypeBuilder extends js.Object {
  def apply(
    checkType: astDashTypesLib.genKindsMod.TSTypeKind,
    extendsType: astDashTypesLib.genKindsMod.TSTypeKind,
    trueType: astDashTypesLib.genKindsMod.TSTypeKind,
    falseType: astDashTypesLib.genKindsMod.TSTypeKind
  ): astDashTypesLib.genNodesMod.TSConditionalType = js.native
  def from(params: astDashTypesLib.Anon_CheckType): astDashTypesLib.genNodesMod.TSConditionalType = js.native
}

