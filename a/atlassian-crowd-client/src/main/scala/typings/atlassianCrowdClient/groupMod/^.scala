package typings.atlassianCrowdClient.groupMod

import typings.atlassianCrowdClient.AnonActive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atlassian-crowd-client/lib/models/group", JSImport.Namespace)
@js.native
class ^ protected () extends Group {
  def this(groupname: String) = this()
  def this(groupname: String, description: String) = this()
  def this(groupname: String, description: String, active: Boolean) = this()
  def this(groupname: String, description: String, active: Boolean, attributes: js.Any) = this()
  /* CompleteClass */
  override val active: Boolean = js.native
  /* CompleteClass */
  override val description: String = js.native
  /* CompleteClass */
  override val groupname: String = js.native
  /* CompleteClass */
  override def toCrowd(): GroupObj = js.native
}

@JSImport("atlassian-crowd-client/lib/models/group", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromCrowd(obj: AnonActive): Group = js.native
}

