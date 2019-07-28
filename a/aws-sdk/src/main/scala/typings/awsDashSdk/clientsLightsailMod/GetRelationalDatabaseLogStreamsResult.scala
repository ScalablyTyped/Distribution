package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRelationalDatabaseLogStreamsResult extends js.Object {
  /**
    * An object describing the result of your get relational database log streams request.
    */
  var logStreams: js.UndefOr[StringList] = js.undefined
}

object GetRelationalDatabaseLogStreamsResult {
  @scala.inline
  def apply(logStreams: StringList = null): GetRelationalDatabaseLogStreamsResult = {
    val __obj = js.Dynamic.literal()
    if (logStreams != null) __obj.updateDynamic("logStreams")(logStreams)
    __obj.asInstanceOf[GetRelationalDatabaseLogStreamsResult]
  }
}

