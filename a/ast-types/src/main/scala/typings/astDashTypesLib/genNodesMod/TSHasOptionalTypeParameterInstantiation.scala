package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSHasOptionalTypeParameterInstantiation extends js.Object {
  var typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind | scala.Null
}

object TSHasOptionalTypeParameterInstantiation {
  @scala.inline
  def apply(typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterInstantiationKind = null): TSHasOptionalTypeParameterInstantiation = {
    val __obj = js.Dynamic.literal()
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[TSHasOptionalTypeParameterInstantiation]
  }
}

