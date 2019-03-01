package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Credentials extends js.Object {
  var accessKeyId: java.lang.String
  var secretAccessKey: java.lang.String
  var sessionToken: js.UndefOr[java.lang.String] = js.undefined
}

object Credentials {
  @scala.inline
  def apply(
    accessKeyId: java.lang.String,
    secretAccessKey: java.lang.String,
    sessionToken: java.lang.String = null
  ): Credentials = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessKeyId")(accessKeyId)
    __obj.updateDynamic("secretAccessKey")(secretAccessKey)
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    __obj.asInstanceOf[Credentials]
  }
}

