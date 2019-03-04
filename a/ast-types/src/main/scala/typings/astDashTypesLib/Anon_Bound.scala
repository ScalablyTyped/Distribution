package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bound extends js.Object {
  var bound: js.UndefOr[astDashTypesLib.genKindsMod.TypeAnnotationKind | scala.Null] = js.undefined
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var name: java.lang.String
  var variance: js.UndefOr[
    astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus | scala.Null
  ] = js.undefined
}

object Anon_Bound {
  @scala.inline
  def apply(
    name: java.lang.String,
    bound: astDashTypesLib.genKindsMod.TypeAnnotationKind = null,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    variance: astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus = null
  ): Anon_Bound = {
    val __obj = js.Dynamic.literal(name = name)
    if (bound != null) __obj.updateDynamic("bound")(bound)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bound]
  }
}

