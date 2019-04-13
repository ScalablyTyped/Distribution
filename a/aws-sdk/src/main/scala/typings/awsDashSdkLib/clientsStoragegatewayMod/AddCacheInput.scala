package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCacheInput extends js.Object {
  /**
    * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum length of 1 and maximum length of 300. You can get the disk IDs from the ListLocalDisks API.
    */
  var DiskIds: awsDashSdkLib.clientsStoragegatewayMod.DiskIds
  var GatewayARN: awsDashSdkLib.clientsStoragegatewayMod.GatewayARN
}

object AddCacheInput {
  @scala.inline
  def apply(DiskIds: DiskIds, GatewayARN: GatewayARN): AddCacheInput = {
    val __obj = js.Dynamic.literal(DiskIds = DiskIds, GatewayARN = GatewayARN)
  
    __obj.asInstanceOf[AddCacheInput]
  }
}

