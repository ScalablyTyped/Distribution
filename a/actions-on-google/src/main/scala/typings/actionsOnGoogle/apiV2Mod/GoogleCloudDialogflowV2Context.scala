package typings.actionsOnGoogle.apiV2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2Context extends js.Object {
  var lifespanCount: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var parameters: js.UndefOr[ApiClientObjectMap[_]] = js.native
}

object GoogleCloudDialogflowV2Context {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2Context = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2Context]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2ContextOps[Self <: GoogleCloudDialogflowV2Context] (val x: Self) extends AnyVal {
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
    def setLifespanCount(value: Double): Self = this.set("lifespanCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifespanCount: Self = this.set("lifespanCount", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParameters(value: ApiClientObjectMap[_]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
  
}

