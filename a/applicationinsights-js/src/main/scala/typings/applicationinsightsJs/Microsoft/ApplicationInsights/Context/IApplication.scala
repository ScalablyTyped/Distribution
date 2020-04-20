package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplication extends js.Object {
  /**
    * The application build version.
    */
  var build: String
  /**
    * The application version.
    */
  var ver: String
}

object IApplication {
  @scala.inline
  def apply(build: String, ver: String): IApplication = {
    val __obj = js.Dynamic.literal(build = build.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplication]
  }
}

