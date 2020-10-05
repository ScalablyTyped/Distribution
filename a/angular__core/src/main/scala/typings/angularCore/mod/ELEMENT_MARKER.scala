package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ELEMENT_MARKER extends js.Object {
  var marker: element = js.native
}

object ELEMENT_MARKER {
  @scala.inline
  def apply(marker: element): ELEMENT_MARKER = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ELEMENT_MARKER]
  }
  @scala.inline
  implicit class ELEMENT_MARKEROps[Self <: ELEMENT_MARKER] (val x: Self) extends AnyVal {
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
    def setMarker(value: element): Self = this.set("marker", value.asInstanceOf[js.Any])
  }
  
}

