package typings.apolloLinkHttpCommon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParseError extends js.Object {
  var parseError: Error
}

object AnonParseError {
  @scala.inline
  def apply(parseError: Error): AnonParseError = {
    val __obj = js.Dynamic.literal(parseError = parseError.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParseError]
  }
}

