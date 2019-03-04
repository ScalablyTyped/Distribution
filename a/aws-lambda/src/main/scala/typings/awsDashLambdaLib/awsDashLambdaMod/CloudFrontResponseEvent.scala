package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[awsDashLambdaLib.Anon_Cf]
}

object CloudFrontResponseEvent {
  @scala.inline
  def apply(Records: js.Array[awsDashLambdaLib.Anon_Cf]): CloudFrontResponseEvent = {
    val __obj = js.Dynamic.literal(Records = Records)
  
    __obj.asInstanceOf[CloudFrontResponseEvent]
  }
}

