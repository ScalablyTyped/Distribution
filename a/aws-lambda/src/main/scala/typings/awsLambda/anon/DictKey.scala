package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictKey
  extends /* Key */ StringDictionary[js.Any] {
  var ServiceToken: String
}

object DictKey {
  @scala.inline
  def apply(ServiceToken: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): DictKey = {
    val __obj = js.Dynamic.literal(ServiceToken = ServiceToken.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictKey]
  }
}

