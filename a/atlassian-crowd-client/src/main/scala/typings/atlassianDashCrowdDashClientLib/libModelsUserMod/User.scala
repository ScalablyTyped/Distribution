package typings
package atlassianDashCrowdDashClientLib.libModelsUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait User extends js.Object {
  val active: scala.Boolean
  val attributes: org.scalablytyped.runtime.StringDictionary[js.Any]
  val displayname: java.lang.String
  val email: java.lang.String
  val firstname: java.lang.String
  val lastname: java.lang.String
  val password: js.UndefOr[java.lang.String] = js.undefined
  val username: java.lang.String
  def toCrowd(): UserObj
}

