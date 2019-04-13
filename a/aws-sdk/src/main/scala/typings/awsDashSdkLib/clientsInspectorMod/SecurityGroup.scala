package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityGroup extends js.Object {
  /**
    * The ID of the security group.
    */
  var groupId: js.UndefOr[Text] = js.undefined
  /**
    * The name of the security group.
    */
  var groupName: js.UndefOr[Text] = js.undefined
}

object SecurityGroup {
  @scala.inline
  def apply(groupId: Text = null, groupName: Text = null): SecurityGroup = {
    val __obj = js.Dynamic.literal()
    if (groupId != null) __obj.updateDynamic("groupId")(groupId)
    if (groupName != null) __obj.updateDynamic("groupName")(groupName)
    __obj.asInstanceOf[SecurityGroup]
  }
}

