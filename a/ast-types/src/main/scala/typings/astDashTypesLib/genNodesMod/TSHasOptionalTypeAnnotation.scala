package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSHasOptionalTypeAnnotation extends js.Object {
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind | scala.Null
}

object TSHasOptionalTypeAnnotation {
  @scala.inline
  def apply(typeAnnotation: astDashTypesLib.genKindsMod.TSTypeAnnotationKind = null): TSHasOptionalTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    __obj.asInstanceOf[TSHasOptionalTypeAnnotation]
  }
}

