package typings.atlassianCrowdClient.mod

import typings.atlassianCrowdClient.AnonAttributes
import typings.atlassianCrowdClient.AnonAttributesChildren
import typings.atlassianCrowdClient.AnonAuthenticate
import typings.atlassianCrowdClient.AnonCookie
import typings.atlassianCrowdClient.AnonCreate
import typings.atlassianCrowdClient.AnonExpand
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrowdClient
  extends typings.atlassianCrowdClient.apiMod.^ {
  var authentication: AnonAuthenticate = js.native
  var config: AnonCookie = js.native
  var group: AnonAttributesChildren = js.native
  var search: AnonExpand = js.native
  var session: AnonCreate = js.native
  var user: AnonAttributes = js.native
}

