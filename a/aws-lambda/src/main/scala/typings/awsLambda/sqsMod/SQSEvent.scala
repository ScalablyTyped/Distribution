package typings.awsLambda.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SQSEvent extends js.Object {
  var Records: js.Array[SQSRecord]
}

object SQSEvent {
  @scala.inline
  def apply(Records: js.Array[SQSRecord]): SQSEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SQSEvent]
  }
}

