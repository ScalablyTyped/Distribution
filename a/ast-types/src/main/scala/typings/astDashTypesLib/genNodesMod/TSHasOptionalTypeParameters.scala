package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSHasOptionalTypeParameters extends js.Object {
  var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null]
}

object TSHasOptionalTypeParameters {
  @scala.inline
  def apply(typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null): TSHasOptionalTypeParameters = {
    val __obj = js.Dynamic.literal()
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSHasOptionalTypeParameters]
  }
}

