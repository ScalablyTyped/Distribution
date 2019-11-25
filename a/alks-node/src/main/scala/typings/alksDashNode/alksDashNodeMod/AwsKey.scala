package typings.alksDashNode.alksDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsKey extends js.Object {
  var accessKey: String
  var secretKey: String
  var sessionToken: String
}

object AwsKey {
  @scala.inline
  def apply(accessKey: String, secretKey: String, sessionToken: String): AwsKey = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AwsKey]
  }
}

