package typings
package angularDashPermissionLib.angularMod.permissionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionStore extends js.Object {
  /**
    * Removes all permissions
    * @method
    */
  def clearStore(): scala.Unit
  /**
    * Allows to define set of permissionNames with shared validation function on application configuration
    * @method
    * @throws {TypeError}
    *
    * @param permissionNames {Array} Set of permission names
    * @param validationFunction {Function} Function used to validate if permission is valid
    */
  def defineManyPermissions(permissionNames: js.Array[java.lang.String], validationFunction: PermissionValidationFunction): scala.Unit
  /**
    * Allows to define permission on application configuration
    * @method
    *
    * @param permissionName {String} Name of defined permission
    * @param validationFunction {Function} Function used to validate if permission is valid
    */
  def definePermission(permissionName: java.lang.String, validationFunction: PermissionValidationFunction): scala.Unit
  /**
    * Returns permission by it's name
    * @method
    *
    * @returns {permission.Permission} Permissions definition object
    */
  def getPermissionDefinition(permissionName: java.lang.String): Permission
  /**
    * Returns all permissions
    * @method
    *
    * @returns {Object} Permissions collection
    */
  def getStore(): org.scalablytyped.runtime.StringDictionary[Permission]
  /**
    * Checks if permission exists
    * @method
    *
    * @param permissionName {String} Name of defined permission
    * @returns {Boolean}
    */
  def hasPermissionDefinition(permissionName: java.lang.String): scala.Boolean
  /**
    * Deletes permission
    * @method
    *
    * @param permissionName {String} Name of defined permission
    */
  def removePermissionDefinition(permissionName: java.lang.String): scala.Unit
}

object PermissionStore {
  @scala.inline
  def apply(
    clearStore: js.Function0[scala.Unit],
    defineManyPermissions: js.Function2[js.Array[java.lang.String], PermissionValidationFunction, scala.Unit],
    definePermission: js.Function2[java.lang.String, PermissionValidationFunction, scala.Unit],
    getPermissionDefinition: js.Function1[java.lang.String, Permission],
    getStore: js.Function0[org.scalablytyped.runtime.StringDictionary[Permission]],
    hasPermissionDefinition: js.Function1[java.lang.String, scala.Boolean],
    removePermissionDefinition: js.Function1[java.lang.String, scala.Unit]
  ): PermissionStore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearStore")(clearStore)
    __obj.updateDynamic("defineManyPermissions")(defineManyPermissions)
    __obj.updateDynamic("definePermission")(definePermission)
    __obj.updateDynamic("getPermissionDefinition")(getPermissionDefinition)
    __obj.updateDynamic("getStore")(getStore)
    __obj.updateDynamic("hasPermissionDefinition")(hasPermissionDefinition)
    __obj.updateDynamic("removePermissionDefinition")(removePermissionDefinition)
    __obj.asInstanceOf[PermissionStore]
  }
}

