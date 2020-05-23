package typings.atlassianCrowdClient.mod

import typings.atlassianCrowdClient.anon.Attributes
import typings.atlassianCrowdClient.anon.Authenticate
import typings.atlassianCrowdClient.anon.Children
import typings.atlassianCrowdClient.anon.Cookie
import typings.atlassianCrowdClient.anon.Create
import typings.atlassianCrowdClient.anon.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrowdClient
  extends typings.atlassianCrowdClient.apiMod.^ {
  var authentication: Authenticate = js.native
  var config: Cookie = js.native
  var group: Children = js.native
  var search: Group = js.native
  var session: Create = js.native
  var user: Attributes = js.native
}

