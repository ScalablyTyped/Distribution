package typings
package angularDashPermissionLib.angularMod.permissionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleStore extends js.Object {
  /**
         * Removes all role definitions
         * @method
         */
  def clearStore(): scala.Unit = js.native
  /**
         * Allows to define role
         * @method
         *
         * @param roleName {String} Name of defined role
         * @param permissions {Array} Set of permission names
         */
  def defineRole(roleName: java.lang.String, permissions: js.Array[java.lang.String]): scala.Unit = js.native
  /**
         * Allows to define role
         * @method
         *
         * @param roleName {String} Name of defined role
         * @param permissions {Array} Set of permission names
         * @param [validationFunction] {Function} Function used to validate if permissions in role are valid
         */
  def defineRole(
    roleName: java.lang.String,
    permissions: js.Array[java.lang.String],
    validationFunction: RoleValidationFunction
  ): scala.Unit = js.native
  /**
         * Returns role definition object by it's name
         * @method
         *
         * @returns {permission.Role} Role definition object
         */
  def getRoleDefinition(roleName: java.lang.String): Role = js.native
  /**
         * Returns all role definitions
         * @method
         *
         * @returns {Object} Defined roles collection
         */
  def getStore(): ScalablyTyped.runtime.StringDictionary[Role] = js.native
  /**
         * Checks if role is defined in store
         * @method
         *
         * @param roleName {String} Name of role
         * @returns {Boolean}
         */
  def hasRoleDefinition(roleName: java.lang.String): scala.Boolean = js.native
  /**
         * Deletes role from store
         * @method
         *
         * @param roleName {String} Name of defined permission
         */
  def removeRoleDefinition(roleName: java.lang.String): scala.Unit = js.native
}

