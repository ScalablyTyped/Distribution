package typings.analyticsDashNode

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyNodeVersion
  extends /* key */ StringDictionary[js.Any] {
  var nodeVersion: String
}

object Anon_KeyNodeVersion {
  @scala.inline
  def apply(nodeVersion: String, StringDictionary: /* key */ StringDictionary[js.Any] = null): Anon_KeyNodeVersion = {
    val __obj = js.Dynamic.literal(nodeVersion = nodeVersion.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_KeyNodeVersion]
  }
}

