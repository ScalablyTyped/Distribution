package typings
package angularDashPermissionLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object permissionNs {
  type PermissionValidationFunction = js.Function2[
    /* permissionName */ js.UndefOr[java.lang.String], 
    /* transitionProperties */ js.UndefOr[TransitionProperties], 
    scala.Boolean | angularLib.angularMod.angularNs.IPromise[js.Any]
  ]
  type RoleValidationFunction = js.Function2[
    /* roleName */ js.UndefOr[java.lang.String], 
    /* transitionProperties */ js.UndefOr[TransitionProperties], 
    scala.Boolean | angularLib.angularMod.angularNs.IPromise[js.Any]
  ]
}
