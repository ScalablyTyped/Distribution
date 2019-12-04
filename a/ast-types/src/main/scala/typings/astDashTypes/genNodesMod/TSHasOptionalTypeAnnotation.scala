package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.TSTypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TSHasOptionalTypeAnnotation extends js.Object {
  var typeAnnotation: TSTypeAnnotationKind | Null
}

object TSHasOptionalTypeAnnotation {
  @scala.inline
  def apply(typeAnnotation: TSTypeAnnotationKind = null): TSHasOptionalTypeAnnotation = {
    val __obj = js.Dynamic.literal()
    if (typeAnnotation != null) __obj.updateDynamic("typeAnnotation")(typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TSHasOptionalTypeAnnotation]
  }
}

