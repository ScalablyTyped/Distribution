package typings.awsDashSdk.clientsDetectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGraphRequest extends js.Object {
  /**
    * The ARN of the behavior graph to disable.
    */
  var GraphArn: typings.awsDashSdk.clientsDetectiveMod.GraphArn = js.native
}

object DeleteGraphRequest {
  @scala.inline
  def apply(GraphArn: GraphArn): DeleteGraphRequest = {
    val __obj = js.Dynamic.literal(GraphArn = GraphArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteGraphRequest]
  }
}

