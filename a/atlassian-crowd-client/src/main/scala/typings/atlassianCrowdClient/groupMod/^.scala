package typings.atlassianCrowdClient.groupMod

import typings.atlassianCrowdClient.anon.Active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atlassian-crowd-client/lib/models/group", JSImport.Namespace)
@js.native
class ^ protected () extends Group {
  def this(groupname: String) = this()
  def this(groupname: String, description: String) = this()
  def this(groupname: String, description: js.UndefOr[scala.Nothing], active: Boolean) = this()
  def this(groupname: String, description: String, active: Boolean) = this()
  def this(
    groupname: String,
    description: js.UndefOr[scala.Nothing],
    active: js.UndefOr[scala.Nothing],
    attributes: js.Any
  ) = this()
  def this(groupname: String, description: js.UndefOr[scala.Nothing], active: Boolean, attributes: js.Any) = this()
  def this(groupname: String, description: String, active: js.UndefOr[scala.Nothing], attributes: js.Any) = this()
  def this(groupname: String, description: String, active: Boolean, attributes: js.Any) = this()
}

@JSImport("atlassian-crowd-client/lib/models/group", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromCrowd(obj: Active): Group = js.native
}

