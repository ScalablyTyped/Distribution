package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ContextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IApplication extends js.Object {
  /**
    * The application build version.
    */
  var build: java.lang.String
  /**
    * The application version.
    */
  var ver: java.lang.String
}

object IApplication {
  @scala.inline
  def apply(build: java.lang.String, ver: java.lang.String): IApplication = {
    val __obj = js.Dynamic.literal(build = build, ver = ver)
  
    __obj.asInstanceOf[IApplication]
  }
}

