package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentResponse extends js.Object {
  /**
    * Error messages for environment variables that couldn't be applied.
    */
  var Error: js.UndefOr[EnvironmentError] = js.undefined
  /**
    * Environment variable key-value pairs.
    */
  var Variables: js.UndefOr[EnvironmentVariables] = js.undefined
}

object EnvironmentResponse {
  @scala.inline
  def apply(Error: EnvironmentError = null, Variables: EnvironmentVariables = null): EnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    if (Error != null) __obj.updateDynamic("Error")(Error)
    if (Variables != null) __obj.updateDynamic("Variables")(Variables)
    __obj.asInstanceOf[EnvironmentResponse]
  }
}

