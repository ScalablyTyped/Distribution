package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var applicationId: java.lang.String
}

object Application {
  @scala.inline
  def apply(
    applicationId: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Application = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applicationId")(applicationId)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Application]
  }
}

