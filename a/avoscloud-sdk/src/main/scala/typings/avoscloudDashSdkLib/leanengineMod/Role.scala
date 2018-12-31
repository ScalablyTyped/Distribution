package typings
package avoscloudDashSdkLib.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Role on the AV server. Roles represent groupings of
  * Users for the purposes of granting permissions (e.g. specifying an ACL
  * for an Object). Roles are specified by their sets of child users and
  * child roles, all of which are granted any permissions that the parent
  * role has.
  *
  * <p>Roles must have a name (which cannot be changed after creation of the
  * role), and must specify an ACL.</p>
  * @class
  * A AV.Role is a local representation of a role persisted to the AV
  * cloud.
  */
@JSImport("leanengine", "Role")
@js.native
class Role protected ()
  extends avoscloudDashSdkLib.avoscloudDashSdkMod.Role {
  def this(name: java.lang.String, acl: avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs.ACL) = this()
}

