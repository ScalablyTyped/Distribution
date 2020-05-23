package typings.accedoAccedoOne.mod

import typings.accedoAccedoOne.anon.Alpha2Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccedoLocale extends js.Object {
  var code: String
  var countryInfo: Alpha2Code
  var displayName: String
}

object AccedoLocale {
  @scala.inline
  def apply(code: String, countryInfo: Alpha2Code, displayName: String): AccedoLocale = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], countryInfo = countryInfo.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccedoLocale]
  }
}

