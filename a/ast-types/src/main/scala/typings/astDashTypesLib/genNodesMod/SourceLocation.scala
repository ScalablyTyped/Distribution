package typings
package astDashTypesLib.genNodesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: astDashTypesLib.genKindsMod.PositionKind
  var source: java.lang.String | scala.Null
  var start: astDashTypesLib.genKindsMod.PositionKind
}

object SourceLocation {
  @scala.inline
  def apply(
    end: astDashTypesLib.genKindsMod.PositionKind,
    start: astDashTypesLib.genKindsMod.PositionKind,
    source: java.lang.String = null
  ): SourceLocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SourceLocation]
  }
}

