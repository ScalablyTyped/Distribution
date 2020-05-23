package typings.analyticsNode.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeVersion
  extends /* key */ StringDictionary[js.Any] {
  var nodeVersion: String
}

object NodeVersion {
  @scala.inline
  def apply(nodeVersion: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): NodeVersion = {
    val __obj = js.Dynamic.literal(nodeVersion = nodeVersion.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[NodeVersion]
  }
}

