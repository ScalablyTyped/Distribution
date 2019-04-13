package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteResourceDataSyncRequest extends js.Object {
  /**
    * The name of the configuration to delete.
    */
  var SyncName: ResourceDataSyncName
}

object DeleteResourceDataSyncRequest {
  @scala.inline
  def apply(SyncName: ResourceDataSyncName): DeleteResourceDataSyncRequest = {
    val __obj = js.Dynamic.literal(SyncName = SyncName)
  
    __obj.asInstanceOf[DeleteResourceDataSyncRequest]
  }
}

