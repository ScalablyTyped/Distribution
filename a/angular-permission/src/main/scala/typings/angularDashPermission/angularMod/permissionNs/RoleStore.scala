package typings.angularDashPermission.angularMod.permissionNs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleStore extends js.Object {
  /**
    * Removes all role definitions
    * @method
    */
  def clearStore(): Unit = js.native
  /**
    * Allows to define role
    * @method
    *
    * @param roleName {String} Name of defined role
    * @param permissions {Array} Set of permission names
    */
  def defineRole(roleName: String, permissions: js.Array[String]): Unit = js.native
  /**
    * Allows to define role
    * @method
    *
    * @param roleName {String} Name of defined role
    * @param permissions {Array} Set of permission names
    * @param [validationFunction] {Function} Function used to validate if permissions in role are valid
    */
  def defineRole(roleName: String, permissions: js.Array[String], validationFunction: RoleValidationFunction): Unit = js.native
  /**
    * Returns role definition object by it's name
    * @method
    *
    * @returns {permission.Role} Role definition object
    */
  def getRoleDefinition(roleName: String): Role = js.native
  /**
    * Returns all role definitions
    * @method
    *
    * @returns {Object} Defined roles collection
    */
  def getStore(): StringDictionary[Role] = js.native
  /**
    * Checks if role is defined in store
    * @method
    *
    * @param roleName {String} Name of role
    * @returns {Boolean}
    */
  def hasRoleDefinition(roleName: String): Boolean = js.native
  /**
    * Deletes role from store
    * @method
    *
    * @param roleName {String} Name of defined permission
    */
  def removeRoleDefinition(roleName: String): Unit = js.native
}

