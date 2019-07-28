package typings.alexaDashSdk.alexaDashSdkMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permissions extends /* key */ StringDictionary[String] {
  /**
    * @deprecated
    */
  var consentToken: String
}

object Permissions {
  @scala.inline
  def apply(consentToken: String, StringDictionary: /* key */ StringDictionary[String] = null): Permissions = {
    val __obj = js.Dynamic.literal(consentToken = consentToken)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Permissions]
  }
}

