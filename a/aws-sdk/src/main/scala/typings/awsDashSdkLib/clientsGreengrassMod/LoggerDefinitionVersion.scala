package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerDefinitionVersion extends js.Object {
  /**
    * A list of loggers.
    */
  var Loggers: js.UndefOr[__listOfLogger] = js.undefined
}

object LoggerDefinitionVersion {
  @scala.inline
  def apply(Loggers: __listOfLogger = null): LoggerDefinitionVersion = {
    val __obj = js.Dynamic.literal()
    if (Loggers != null) __obj.updateDynamic("Loggers")(Loggers)
    __obj.asInstanceOf[LoggerDefinitionVersion]
  }
}

