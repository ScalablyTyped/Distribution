package typings
package analyticsDashNodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyNodeVersion
  extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var nodeVersion: java.lang.String
}

object Anon_KeyNodeVersion {
  @scala.inline
  def apply(
    nodeVersion: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): Anon_KeyNodeVersion = {
    val __obj = js.Dynamic.literal(nodeVersion = nodeVersion)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_KeyNodeVersion]
  }
}

