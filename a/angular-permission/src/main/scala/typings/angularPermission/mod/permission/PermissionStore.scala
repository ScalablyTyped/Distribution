package typings.angularPermission.mod.permission

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionStore extends js.Object {
  /**
    * Removes all permissions
    * @method
    */
  def clearStore(): Unit
  /**
    * Allows to define set of permissionNames with shared validation function on application configuration
    * @method
    * @throws {TypeError}
    *
    * @param permissionNames {Array} Set of permission names
    * @param validationFunction {Function} Function used to validate if permission is valid
    */
  def defineManyPermissions(permissionNames: js.Array[String], validationFunction: PermissionValidationFunction): Unit
  /**
    * Allows to define permission on application configuration
    * @method
    *
    * @param permissionName {String} Name of defined permission
    * @param validationFunction {Function} Function used to validate if permission is valid
    */
  def definePermission(permissionName: String, validationFunction: PermissionValidationFunction): Unit
  /**
    * Returns permission by it's name
    * @method
    *
    * @returns {permission.Permission} Permissions definition object
    */
  def getPermissionDefinition(permissionName: String): Permission
  /**
    * Returns all permissions
    * @method
    *
    * @returns {Object} Permissions collection
    */
  def getStore(): StringDictionary[Permission]
  /**
    * Checks if permission exists
    * @method
    *
    * @param permissionName {String} Name of defined permission
    * @returns {Boolean}
    */
  def hasPermissionDefinition(permissionName: String): Boolean
  /**
    * Deletes permission
    * @method
    *
    * @param permissionName {String} Name of defined permission
    */
  def removePermissionDefinition(permissionName: String): Unit
}

object PermissionStore {
  @scala.inline
  def apply(
    clearStore: () => Unit,
    defineManyPermissions: (js.Array[String], PermissionValidationFunction) => Unit,
    definePermission: (String, PermissionValidationFunction) => Unit,
    getPermissionDefinition: String => Permission,
    getStore: () => StringDictionary[Permission],
    hasPermissionDefinition: String => Boolean,
    removePermissionDefinition: String => Unit
  ): PermissionStore = {
    val __obj = js.Dynamic.literal(clearStore = js.Any.fromFunction0(clearStore), defineManyPermissions = js.Any.fromFunction2(defineManyPermissions), definePermission = js.Any.fromFunction2(definePermission), getPermissionDefinition = js.Any.fromFunction1(getPermissionDefinition), getStore = js.Any.fromFunction0(getStore), hasPermissionDefinition = js.Any.fromFunction1(hasPermissionDefinition), removePermissionDefinition = js.Any.fromFunction1(removePermissionDefinition))
    __obj.asInstanceOf[PermissionStore]
  }
}

