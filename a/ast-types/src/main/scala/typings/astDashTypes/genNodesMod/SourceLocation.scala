package typings.astDashTypes.genNodesMod

import typings.astDashTypes.genKindsMod.PositionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceLocation extends js.Object {
  var end: PositionKind
  var source: String | Null
  var start: PositionKind
}

object SourceLocation {
  @scala.inline
  def apply(end: PositionKind, start: PositionKind, source: String = null): SourceLocation = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceLocation]
  }
}

