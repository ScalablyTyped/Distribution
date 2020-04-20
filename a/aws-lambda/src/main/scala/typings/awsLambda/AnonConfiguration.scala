package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfiguration extends js.Object {
  var configuration: AnonFunctionName
}

object AnonConfiguration {
  @scala.inline
  def apply(configuration: AnonFunctionName): AnonConfiguration = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfiguration]
  }
}

