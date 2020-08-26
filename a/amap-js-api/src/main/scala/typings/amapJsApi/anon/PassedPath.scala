package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassedPath extends js.Object {
  var passedPath: js.Array[LngLat] = js.native
}

object PassedPath {
  @scala.inline
  def apply(passedPath: js.Array[LngLat]): PassedPath = {
    val __obj = js.Dynamic.literal(passedPath = passedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassedPath]
  }
  @scala.inline
  implicit class PassedPathOps[Self <: PassedPath] (val x: Self) extends AnyVal {
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
    def setPassedPathVarargs(value: LngLat*): Self = this.set("passedPath", js.Array(value :_*))
    @scala.inline
    def setPassedPath(value: js.Array[LngLat]): Self = this.set("passedPath", value.asInstanceOf[js.Any])
  }
  
}

