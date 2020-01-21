package typings.angularPermission.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object permission {
  type PermissionValidationFunction = js.Function2[
    /* permissionName */ js.UndefOr[java.lang.String], 
    /* transitionProperties */ js.UndefOr[typings.angularPermission.mod.permission.TransitionProperties], 
    scala.Boolean | typings.angular.mod.IPromise[js.Any]
  ]
  type RoleValidationFunction = js.Function2[
    /* roleName */ js.UndefOr[java.lang.String], 
    /* transitionProperties */ js.UndefOr[typings.angularPermission.mod.permission.TransitionProperties], 
    scala.Boolean | typings.angular.mod.IPromise[js.Any]
  ]
}
