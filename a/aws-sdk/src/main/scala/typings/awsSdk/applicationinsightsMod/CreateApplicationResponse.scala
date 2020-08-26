package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationResponse extends js.Object {
  /**
    * Information about the application.
    */
  var ApplicationInfo: js.UndefOr[typings.awsSdk.applicationinsightsMod.ApplicationInfo] = js.native
}

object CreateApplicationResponse {
  @scala.inline
  def apply(): CreateApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApplicationResponse]
  }
  @scala.inline
  implicit class CreateApplicationResponseOps[Self <: CreateApplicationResponse] (val x: Self) extends AnyVal {
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
    def setApplicationInfo(value: ApplicationInfo): Self = this.set("ApplicationInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationInfo: Self = this.set("ApplicationInfo", js.undefined)
  }
  
}

