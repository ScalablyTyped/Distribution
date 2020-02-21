package typings.awsLambda.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var accessKeyId: String
  var secretAccessKey: String
  var sessionToken: js.UndefOr[String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(accessKeyId: String, secretAccessKey: String, sessionToken: String = null): Credentials = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Credentials]
  }
}

