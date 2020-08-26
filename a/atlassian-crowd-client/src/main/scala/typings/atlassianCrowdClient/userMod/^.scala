package typings.atlassianCrowdClient.userMod

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
    password: js.UndefOr[scala.Nothing],
    active: Boolean
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
    password: js.UndefOr[scala.Nothing],
    active: js.UndefOr[scala.Nothing],
    attributes: js.Any
  ) = this()
  def this(
    firstname: String,
    lastname: String,
    displayname: String,
    email: String,
    username: String,
    password: js.UndefOr[scala.Nothing],
    active: Boolean,
    attributes: js.Any
  ) = this()
  def this(
    firstname: String,
    lastname: String,
    displayname: String,
    email: String,
    username: String,
    password: String,
    active: js.UndefOr[scala.Nothing],
    attributes: js.Any
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
}

@JSImport("atlassian-crowd-client/lib/models/user", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromCrowd(userObj: UserObj): User = js.native
}

