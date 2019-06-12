package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEventTrackerRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dataset group that receives the event data.
    */
  var datasetGroupArn: Arn
  /**
    * The name for the event tracker.
    */
  var name: Name
}

object CreateEventTrackerRequest {
  @scala.inline
  def apply(datasetGroupArn: Arn, name: Name): CreateEventTrackerRequest = {
    val __obj = js.Dynamic.literal(datasetGroupArn = datasetGroupArn, name = name)
  
    __obj.asInstanceOf[CreateEventTrackerRequest]
  }
}

