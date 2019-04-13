package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityInfo extends js.Object {
  var Arn: arnType
  /**
    * The identifier of the entity (user or role).
    */
  var Id: idType
  /**
    * The name of the entity (user or role).
    */
  var Name: userNameType
  /**
    * The path to the entity (user or role). For more information about paths, see IAM Identifiers in the Using IAM guide. 
    */
  var Path: js.UndefOr[pathType] = js.undefined
  /**
    * The type of entity (user or role).
    */
  var Type: policyOwnerEntityType
}

object EntityInfo {
  @scala.inline
  def apply(Arn: arnType, Id: idType, Name: userNameType, Type: policyOwnerEntityType, Path: pathType = null): EntityInfo = {
    val __obj = js.Dynamic.literal(Arn = Arn, Id = Id, Name = Name, Type = Type.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path)
    __obj.asInstanceOf[EntityInfo]
  }
}

