package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppString extends js.Object {
  var app: String
  var appArgs: js.UndefOr[String] = js.undefined
}

object AppString {
  @scala.inline
  def apply(app: String, appArgs: String = null): AppString = {
    val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
    if (appArgs != null) __obj.updateDynamic("appArgs")(appArgs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppString]
  }
}

