package typings.awsLambda

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKeyServiceToken
  extends /* Key */ StringDictionary[js.Any] {
  var ServiceToken: String
}

object AnonKeyServiceToken {
  @scala.inline
  def apply(ServiceToken: String, StringDictionary: /* Key */ StringDictionary[js.Any] = null): AnonKeyServiceToken = {
    val __obj = js.Dynamic.literal(ServiceToken = ServiceToken.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonKeyServiceToken]
  }
}

