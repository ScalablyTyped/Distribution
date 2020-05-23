package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsSdkVersion extends js.Object {
  var awsSdkVersion: String
  var clientId: String
}

object AwsSdkVersion {
  @scala.inline
  def apply(awsSdkVersion: String, clientId: String): AwsSdkVersion = {
    val __obj = js.Dynamic.literal(awsSdkVersion = awsSdkVersion.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsSdkVersion]
  }
}

