package typings
package amplifyLib.amplifyMod.amplifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestSettings extends js.Object {
  var data: js.UndefOr[js.Any] = js.undefined
  var error: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var resourceId: java.lang.String
  var success: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
}

object RequestSettings {
  @scala.inline
  def apply(
    resourceId: java.lang.String,
    data: js.Any = null,
    error: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    success: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): RequestSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("resourceId")(resourceId)
    if (data != null) __obj.updateDynamic("data")(data)
    if (error != null) __obj.updateDynamic("error")(error)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[RequestSettings]
  }
}

