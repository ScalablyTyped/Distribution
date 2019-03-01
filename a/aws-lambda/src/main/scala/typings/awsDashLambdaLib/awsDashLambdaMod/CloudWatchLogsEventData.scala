package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLogsEventData extends js.Object {
  var data: java.lang.String
}

object CloudWatchLogsEventData {
  @scala.inline
  def apply(data: java.lang.String): CloudWatchLogsEventData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[CloudWatchLogsEventData]
  }
}

