package typings.atlassianDashCrowdDashClient.atlassianDashCrowdDashClientMod

import typings.atlassianDashCrowdDashClient.Anon_Attributes
import typings.atlassianDashCrowdDashClient.Anon_AttributesChildren
import typings.atlassianDashCrowdDashClient.Anon_Authenticate
import typings.atlassianDashCrowdDashClient.Anon_Cookie
import typings.atlassianDashCrowdDashClient.Anon_Create
import typings.atlassianDashCrowdDashClient.Anon_Expand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrowdClient
  extends typings.atlassianDashCrowdDashClient.apiMod.^ {
  var authentication: Anon_Authenticate = js.native
  var config: Anon_Cookie = js.native
  var group: Anon_AttributesChildren = js.native
  var search: Anon_Expand = js.native
  var session: Anon_Create = js.native
  var user: Anon_Attributes = js.native
}

