package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_Cf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFrontResponseEvent extends js.Object {
  var Records: js.Array[Anon_Cf]
}

object CloudFrontResponseEvent {
  @scala.inline
  def apply(Records: js.Array[Anon_Cf]): CloudFrontResponseEvent = {
    val __obj = js.Dynamic.literal(Records = Records)
  
    __obj.asInstanceOf[CloudFrontResponseEvent]
  }
}

