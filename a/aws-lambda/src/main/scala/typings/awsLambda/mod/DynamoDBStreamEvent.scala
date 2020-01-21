package typings.awsLambda.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamoDBStreamEvent extends js.Object {
  var Records: js.Array[DynamoDBRecord]
}

object DynamoDBStreamEvent {
  @scala.inline
  def apply(Records: js.Array[DynamoDBRecord]): DynamoDBStreamEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DynamoDBStreamEvent]
  }
}

