package typings.awsLambda

import typings.awsLambda.awsLambdaStrings.KMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKMS extends js.Object {
  var `type`: KMS
}

object AnonKMS {
  @scala.inline
  def apply(`type`: KMS): AnonKMS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonKMS]
  }
}

