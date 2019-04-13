package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyClientPropertiesRequest extends js.Object {
  /**
    * Information about the Amazon WorkSpaces client.
    */
  var ClientProperties: awsDashSdkLib.clientsWorkspacesMod.ClientProperties
  /**
    * The resource identifiers, in the form of directory IDs.
    */
  var ResourceId: NonEmptyString
}

object ModifyClientPropertiesRequest {
  @scala.inline
  def apply(ClientProperties: ClientProperties, ResourceId: NonEmptyString): ModifyClientPropertiesRequest = {
    val __obj = js.Dynamic.literal(ClientProperties = ClientProperties, ResourceId = ResourceId)
  
    __obj.asInstanceOf[ModifyClientPropertiesRequest]
  }
}

