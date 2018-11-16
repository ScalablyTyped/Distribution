package typings
package atlassianDashCrowdDashClientLib.libModelsGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Group extends js.Object {
  val active: scala.Boolean
  val attributes: js.UndefOr[js.Any] = js.undefined
  val description: java.lang.String
  val groupname: java.lang.String
  def toCrowd(): GroupObj
}

