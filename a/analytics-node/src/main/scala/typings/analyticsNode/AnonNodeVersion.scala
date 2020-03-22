package typings.analyticsNode

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNodeVersion
  extends /* key */ StringDictionary[js.Any] {
  var nodeVersion: String
}

object AnonNodeVersion {
  @scala.inline
  def apply(nodeVersion: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): AnonNodeVersion = {
    val __obj = js.Dynamic.literal(nodeVersion = nodeVersion.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonNodeVersion]
  }
}

