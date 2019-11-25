package typings.awsDashLambda.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLogsEventData extends js.Object {
  var data: String
}

object CloudWatchLogsEventData {
  @scala.inline
  def apply(data: String): CloudWatchLogsEventData = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudWatchLogsEventData]
  }
}

