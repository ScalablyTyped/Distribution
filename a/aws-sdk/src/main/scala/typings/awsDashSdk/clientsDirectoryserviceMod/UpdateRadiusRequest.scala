package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRadiusRequest extends js.Object {
  /**
    * The identifier of the directory for which to update the RADIUS server information.
    */
  var DirectoryId: typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId
  /**
    * A RadiusSettings object that contains information about the RADIUS server.
    */
  var RadiusSettings: typings.awsDashSdk.clientsDirectoryserviceMod.RadiusSettings
}

object UpdateRadiusRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, RadiusSettings: RadiusSettings): UpdateRadiusRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId, RadiusSettings = RadiusSettings)
  
    __obj.asInstanceOf[UpdateRadiusRequest]
  }
}

