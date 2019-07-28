package typings.alexaDashSdk.alexaDashSdkMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends /* key */ StringDictionary[String] {
  var applicationId: String
}

object Application {
  @scala.inline
  def apply(applicationId: String, StringDictionary: /* key */ StringDictionary[String] = null): Application = {
    val __obj = js.Dynamic.literal(applicationId = applicationId)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Application]
  }
}

