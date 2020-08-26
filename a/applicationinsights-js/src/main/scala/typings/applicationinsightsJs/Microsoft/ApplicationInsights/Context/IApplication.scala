package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IApplication extends js.Object {
  /**
    * The application build version.
    */
  var build: String = js.native
  /**
    * The application version.
    */
  var ver: String = js.native
}

object IApplication {
  @scala.inline
  def apply(build: String, ver: String): IApplication = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplication]
  }
  @scala.inline
  implicit class IApplicationOps[Self <: IApplication] (val x: Self) extends AnyVal {
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
    def setBuild(value: String): Self = this.set("build", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: String): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

