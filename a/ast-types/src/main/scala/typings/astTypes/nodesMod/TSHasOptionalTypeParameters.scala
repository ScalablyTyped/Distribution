package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSHasOptionalTypeParameters extends js.Object {
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}

object TSHasOptionalTypeParameters {
  @scala.inline
  def apply(typeParameters: TSTypeParameterDeclarationKind = null): TSHasOptionalTypeParameters = {
    val __obj = js.Dynamic.literal()
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSHasOptionalTypeParameters]
  }
}

