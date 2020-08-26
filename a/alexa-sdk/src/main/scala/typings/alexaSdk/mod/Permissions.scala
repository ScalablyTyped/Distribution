package typings.alexaSdk.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permissions extends /* key */ StringDictionary[String] {
  /**
    * @deprecated
    */
  var consentToken: String = js.native
}

object Permissions {
  @scala.inline
  def apply(consentToken: String): Permissions = {
    val __obj = js.Dynamic.literal(consentToken = consentToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permissions]
  }
  @scala.inline
  implicit class PermissionsOps[Self <: Permissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConsentToken(value: String): Self = this.set("consentToken", value.asInstanceOf[js.Any])
  }
  
}

