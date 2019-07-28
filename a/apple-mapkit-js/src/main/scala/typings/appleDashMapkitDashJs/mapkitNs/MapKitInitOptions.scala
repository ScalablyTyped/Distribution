package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapKitInitOptions extends js.Object {
  var authorizationCallback: js.UndefOr[js.Function1[/* done */ js.Function1[/* token */ String, Unit], Unit]] = js.undefined
  var language: js.UndefOr[String] = js.undefined
}

object MapKitInitOptions {
  @scala.inline
  def apply(
    authorizationCallback: /* done */ js.Function1[/* token */ String, Unit] => Unit = null,
    language: String = null
  ): MapKitInitOptions = {
    val __obj = js.Dynamic.literal()
    if (authorizationCallback != null) __obj.updateDynamic("authorizationCallback")(js.Any.fromFunction1(authorizationCallback))
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[MapKitInitOptions]
  }
}

