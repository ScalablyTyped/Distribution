package typings.angularDashPermission.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object permissionNs {
  import typings.angular.angularMod.IPromise

  type PermissionValidationFunction = js.Function2[
    /* permissionName */ js.UndefOr[String], 
    /* transitionProperties */ js.UndefOr[TransitionProperties], 
    Boolean | IPromise[js.Any]
  ]
  type RoleValidationFunction = js.Function2[
    /* roleName */ js.UndefOr[String], 
    /* transitionProperties */ js.UndefOr[TransitionProperties], 
    Boolean | IPromise[js.Any]
  ]
}
