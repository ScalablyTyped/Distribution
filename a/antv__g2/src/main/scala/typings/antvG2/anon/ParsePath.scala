package typings.antvG2.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsePath extends js.Object {
  var parsePath: js.Any = js.native
  var parsePoint: js.Any = js.native
  var parsePoints: js.Any = js.native
}

object ParsePath {
  @scala.inline
  def apply(parsePath: js.Any, parsePoint: js.Any, parsePoints: js.Any): ParsePath = {
    val __obj = js.Dynamic.literal(parsePath = parsePath.asInstanceOf[js.Any], parsePoint = parsePoint.asInstanceOf[js.Any], parsePoints = parsePoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsePath]
  }
  @scala.inline
  implicit class ParsePathOps[Self <: ParsePath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setParsePath(value: js.Any): Self = this.set("parsePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsePoint(value: js.Any): Self = this.set("parsePoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsePoints(value: js.Any): Self = this.set("parsePoints", value.asInstanceOf[js.Any])
  }
  
}

