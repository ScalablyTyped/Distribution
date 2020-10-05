package typings.antd.drawerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushState extends js.Object {
  var distance: String | Double = js.native
}

object PushState {
  @scala.inline
  def apply(distance: String | Double): PushState = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushState]
  }
  @scala.inline
  implicit class PushStateOps[Self <: PushState] (val x: Self) extends AnyVal {
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
    def setDistance(value: String | Double): Self = this.set("distance", value.asInstanceOf[js.Any])
  }
  
}

