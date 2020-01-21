package typings.astTypes.nodesMod

import typings.astTypes.kindsMod.TSTypeParameterInstantiationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSHasOptionalTypeParameterInstantiation extends js.Object {
  var typeParameters: TSTypeParameterInstantiationKind | Null
}

object TSHasOptionalTypeParameterInstantiation {
  @scala.inline
  def apply(typeParameters: TSTypeParameterInstantiationKind = null): TSHasOptionalTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal()
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSHasOptionalTypeParameterInstantiation]
  }
}

