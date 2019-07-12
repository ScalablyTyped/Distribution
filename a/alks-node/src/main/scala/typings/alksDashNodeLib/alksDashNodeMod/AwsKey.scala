package typings
package alksDashNodeLib.alksDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AwsKey extends js.Object {
  var accessKey: java.lang.String
  var secretKey: java.lang.String
  var sessionToken: java.lang.String
}

object AwsKey {
  @scala.inline
  def apply(accessKey: java.lang.String, secretKey: java.lang.String, sessionToken: java.lang.String): AwsKey = {
    val __obj = js.Dynamic.literal(accessKey = accessKey, secretKey = secretKey, sessionToken = sessionToken)
  
    __obj.asInstanceOf[AwsKey]
  }
}

