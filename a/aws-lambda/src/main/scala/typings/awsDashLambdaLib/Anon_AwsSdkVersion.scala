package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AwsSdkVersion extends js.Object {
  var awsSdkVersion: java.lang.String
  var clientId: java.lang.String
}

object Anon_AwsSdkVersion {
  @scala.inline
  def apply(awsSdkVersion: java.lang.String, clientId: java.lang.String): Anon_AwsSdkVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("awsSdkVersion")(awsSdkVersion)
    __obj.updateDynamic("clientId")(clientId)
    __obj.asInstanceOf[Anon_AwsSdkVersion]
  }
}

