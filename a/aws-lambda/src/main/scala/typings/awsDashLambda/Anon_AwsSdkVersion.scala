package typings.awsDashLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AwsSdkVersion extends js.Object {
  var awsSdkVersion: String
  var clientId: String
}

object Anon_AwsSdkVersion {
  @scala.inline
  def apply(awsSdkVersion: String, clientId: String): Anon_AwsSdkVersion = {
    val __obj = js.Dynamic.literal(awsSdkVersion = awsSdkVersion.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AwsSdkVersion]
  }
}

