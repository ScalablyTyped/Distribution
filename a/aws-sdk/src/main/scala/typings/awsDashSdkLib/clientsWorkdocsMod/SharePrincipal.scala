package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharePrincipal extends js.Object {
  /**
    * The ID of the recipient.
    */
  var Id: IdType
  /**
    * The role of the recipient.
    */
  var Role: RoleType
  /**
    * The type of the recipient.
    */
  var Type: PrincipalType
}

object SharePrincipal {
  @scala.inline
  def apply(Id: IdType, Role: RoleType, Type: PrincipalType): SharePrincipal = {
    val __obj = js.Dynamic.literal(Id = Id, Role = Role.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SharePrincipal]
  }
}

