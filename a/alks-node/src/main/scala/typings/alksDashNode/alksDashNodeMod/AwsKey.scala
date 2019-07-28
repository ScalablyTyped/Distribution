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
    val __obj = js.Dynamic.literal(accessKey = accessKey, secretKey = secretKey, sessionToken = sessionToken)
  
    __obj.asInstanceOf[AwsKey]
  }
}

