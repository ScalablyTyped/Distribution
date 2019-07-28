package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLoggerDefinitionVersionRequest extends js.Object {
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: __string
  /**
    * A list of loggers.
    */
  var Loggers: js.UndefOr[__listOfLogger] = js.undefined
}

object CreateLoggerDefinitionVersionRequest {
  @scala.inline
  def apply(LoggerDefinitionId: __string, AmznClientToken: __string = null, Loggers: __listOfLogger = null): CreateLoggerDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId)
    if (AmznClientToken != null) __obj.updateDynamic("AmznClientToken")(AmznClientToken)
    if (Loggers != null) __obj.updateDynamic("Loggers")(Loggers)
    __obj.asInstanceOf[CreateLoggerDefinitionVersionRequest]
  }
}

