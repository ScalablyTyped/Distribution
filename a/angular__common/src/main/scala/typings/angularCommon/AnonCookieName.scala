package typings.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCookieName extends js.Object {
  var cookieName: js.UndefOr[String] = js.undefined
  var headerName: js.UndefOr[String] = js.undefined
}

object AnonCookieName {
  @scala.inline
  def apply(cookieName: String = null, headerName: String = null): AnonCookieName = {
    val __obj = js.Dynamic.literal()
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (headerName != null) __obj.updateDynamic("headerName")(headerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCookieName]
  }
}

