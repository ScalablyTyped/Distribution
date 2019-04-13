package typings
package atlassianDashCrowdDashClientLib.libModelsGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atlassian-crowd-client/lib/models/group", JSImport.Namespace)
@js.native
class ^ protected () extends Group {
  def this(groupname: java.lang.String) = this()
  def this(groupname: java.lang.String, description: java.lang.String) = this()
  def this(groupname: java.lang.String, description: java.lang.String, active: scala.Boolean) = this()
  def this(groupname: java.lang.String, description: java.lang.String, active: scala.Boolean, attributes: js.Any) = this()
  /* CompleteClass */
  override val active: scala.Boolean = js.native
  /* CompleteClass */
  override val description: java.lang.String = js.native
  /* CompleteClass */
  override val groupname: java.lang.String = js.native
  /* CompleteClass */
  override def toCrowd(): GroupObj = js.native
}

@JSImport("atlassian-crowd-client/lib/models/group", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def fromCrowd(obj: atlassianDashCrowdDashClientLib.Anon_Active): Group = js.native
}

