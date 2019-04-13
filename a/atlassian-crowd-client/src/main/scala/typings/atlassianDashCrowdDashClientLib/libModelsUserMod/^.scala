package typings
package atlassianDashCrowdDashClientLib.libModelsUserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atlassian-crowd-client/lib/models/user", JSImport.Namespace)
@js.native
class ^ protected () extends User {
  def this(firstname: java.lang.String, lastname: java.lang.String, displayname: java.lang.String, email: java.lang.String, username: java.lang.String) = this()
  def this(firstname: java.lang.String, lastname: java.lang.String, displayname: java.lang.String, email: java.lang.String, username: java.lang.String, password: java.lang.String) = this()
  def this(firstname: java.lang.String, lastname: java.lang.String, displayname: java.lang.String, email: java.lang.String, username: java.lang.String, password: java.lang.String, active: scala.Boolean) = this()
  def this(firstname: java.lang.String, lastname: java.lang.String, displayname: java.lang.String, email: java.lang.String, username: java.lang.String, password: java.lang.String, active: scala.Boolean, attributes: js.Any) = this()
  /* CompleteClass */
  override val active: scala.Boolean = js.native
  /* CompleteClass */
  override val attributes: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override val displayname: java.lang.String = js.native
  /* CompleteClass */
  override val email: java.lang.String = js.native
  /* CompleteClass */
  override val firstname: java.lang.String = js.native
  /* CompleteClass */
  override val lastname: java.lang.String = js.native
  /* CompleteClass */
  override val username: java.lang.String = js.native
  /* CompleteClass */
  override def toCrowd(): UserObj = js.native
}

@JSImport("atlassian-crowd-client/lib/models/user", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromCrowd(userObj: UserObj): User = js.native
}

