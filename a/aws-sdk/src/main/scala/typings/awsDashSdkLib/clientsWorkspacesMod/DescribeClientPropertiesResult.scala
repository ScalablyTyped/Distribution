package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeClientPropertiesResult extends js.Object {
  /**
    * Information about the specified Amazon WorkSpaces clients.
    */
  var ClientPropertiesList: js.UndefOr[ClientPropertiesList] = js.undefined
}

object DescribeClientPropertiesResult {
  @scala.inline
  def apply(ClientPropertiesList: ClientPropertiesList = null): DescribeClientPropertiesResult = {
    val __obj = js.Dynamic.literal()
    if (ClientPropertiesList != null) __obj.updateDynamic("ClientPropertiesList")(ClientPropertiesList)
    __obj.asInstanceOf[DescribeClientPropertiesResult]
  }
}

