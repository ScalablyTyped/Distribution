package typings.alexaSdk.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Application extends /* key */ StringDictionary[String] {
  var applicationId: String
}

object Application {
  @scala.inline
  def apply(applicationId: String, StringDictionary: /* name */ StringDictionary[String] = null): Application = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Application]
  }
}

