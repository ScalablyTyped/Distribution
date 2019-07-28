package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMetadata extends js.Object {
  /**
    * The ID of the user group.
    */
  var Id: js.UndefOr[IdType] = js.undefined
  /**
    * The name of the group.
    */
  var Name: js.UndefOr[GroupNameType] = js.undefined
}

object GroupMetadata {
  @scala.inline
  def apply(Id: IdType = null, Name: GroupNameType = null): GroupMetadata = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[GroupMetadata]
  }
}

