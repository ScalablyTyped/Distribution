package typings
package atlassianDashCrowdDashClientLib.libModelsSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  val createdAt: stdLib.Date
  val expiresAt: stdLib.Date
  val token: java.lang.String
  def toCrowd(): SessionObj
}

