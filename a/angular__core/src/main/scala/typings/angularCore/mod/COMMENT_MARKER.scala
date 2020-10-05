package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait COMMENT_MARKER extends js.Object {
  var marker: comment = js.native
}

object COMMENT_MARKER {
  @scala.inline
  def apply(marker: comment): COMMENT_MARKER = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[COMMENT_MARKER]
  }
  @scala.inline
  implicit class COMMENT_MARKEROps[Self <: COMMENT_MARKER] (val x: Self) extends AnyVal {
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
    def setMarker(value: comment): Self = this.set("marker", value.asInstanceOf[js.Any])
  }
  
}

