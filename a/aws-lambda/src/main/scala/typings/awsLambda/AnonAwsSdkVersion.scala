package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAwsSdkVersion extends js.Object {
  var awsSdkVersion: String
  var clientId: String
}

object AnonAwsSdkVersion {
  @scala.inline
  def apply(awsSdkVersion: String, clientId: String): AnonAwsSdkVersion = {
    val __obj = js.Dynamic.literal(awsSdkVersion = awsSdkVersion.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAwsSdkVersion]
  }
}

