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
    clearStore: () => scala.Unit,
    defineManyPermissions: (js.Array[java.lang.String], PermissionValidationFunction) => scala.Unit,
    definePermission: (java.lang.String, PermissionValidationFunction) => scala.Unit,
    getPermissionDefinition: java.lang.String => Permission,
    getStore: () => org.scalablytyped.runtime.StringDictionary[Permission],
    hasPermissionDefinition: java.lang.String => scala.Boolean,
    removePermissionDefinition: java.lang.String => scala.Unit
  ): PermissionStore = {
    val __obj = js.Dynamic.literal(clearStore = js.Any.fromFunction0(clearStore), defineManyPermissions = js.Any.fromFunction2(defineManyPermissions), definePermission = js.Any.fromFunction2(definePermission), getPermissionDefinition = js.Any.fromFunction1(getPermissionDefinition), getStore = js.Any.fromFunction0(getStore), hasPermissionDefinition = js.Any.fromFunction1(hasPermissionDefinition), removePermissionDefinition = js.Any.fromFunction1(removePermissionDefinition))
  
    __obj.asInstanceOf[PermissionStore]
  }
}

