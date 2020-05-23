package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieName extends js.Object {
  var cookieName: js.UndefOr[String] = js.undefined
  var headerName: js.UndefOr[String] = js.undefined
}

object CookieName {
  @scala.inline
  def apply(cookieName: String = null, headerName: String = null): CookieName = {
    val __obj = js.Dynamic.literal()
    if (cookieName != null) __obj.updateDynamic("cookieName")(cookieName.asInstanceOf[js.Any])
    if (headerName != null) __obj.updateDynamic("headerName")(headerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieName]
  }
}

