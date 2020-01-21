package typings.atlassianCrowdClient.userMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atlassian-crowd-client/lib/models/user", JSImport.Namespace)
@js.native
class ^ protected () extends User {
  def this(firstname: String, lastname: String, displayname: String, email: String, username: String) = this()
  def this(
    firstname: String,
    lastname: String,
    displayname: String,
    email: String,
    username: String,
    password: String
  ) = this()
  def this(
    firstname: String,
    lastname: String,
    displayname: String,
    email: String,
    username: String,
    password: String,
    active: Boolean
  ) = this()
  def this(
    firstname: String,
    lastname: String,
    displayname: String,
    email: String,
    username: String,
    password: String,
    active: Boolean,
    attributes: js.Any
  ) = this()
  /* CompleteClass */
  override val active: Boolean = js.native
  /* CompleteClass */
  override val attributes: StringDictionary[js.Any] = js.native
  /* CompleteClass */
  override val displayname: String = js.native
  /* CompleteClass */
  override val email: String = js.native
  /* CompleteClass */
  override val firstname: String = js.native
  /* CompleteClass */
  override val lastname: String = js.native
  /* CompleteClass */
  override val username: String = js.native
  /* CompleteClass */
  override def toCrowd(): UserObj = js.native
}

@JSImport("atlassian-crowd-client/lib/models/user", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromCrowd(userObj: UserObj): User = js.native
}

