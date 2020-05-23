package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceIPAddress extends js.Object {
  var sourceIPAddress: String
}

object SourceIPAddress {
  @scala.inline
  def apply(sourceIPAddress: String): SourceIPAddress = {
    val __obj = js.Dynamic.literal(sourceIPAddress = sourceIPAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceIPAddress]
  }
}

