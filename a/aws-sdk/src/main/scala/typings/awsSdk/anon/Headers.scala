package typings.awsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers extends js.Object {
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  var method: js.UndefOr[String] = js.native
}

object Headers {
  @scala.inline
  def apply(headers: StringDictionary[String] = null, method: String = null): Headers = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers]
  }
}

