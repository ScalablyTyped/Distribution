package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permissions
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  /**
    * @deprecated
    */
  var consentToken: java.lang.String
}

object Permissions {
  @scala.inline
  def apply(
    consentToken: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Permissions = {
    val __obj = js.Dynamic.literal(consentToken = consentToken)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Permissions]
  }
}

