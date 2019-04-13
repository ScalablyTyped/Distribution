package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateApplicationSnapshotRequest extends js.Object {
  /**
    * The name of an existing application
    */
  var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * An identifier for the application snapshot.
    */
  var SnapshotName: awsDashSdkLib.clientsKinesisanalyticsv2Mod.SnapshotName
}

object CreateApplicationSnapshotRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, SnapshotName: SnapshotName): CreateApplicationSnapshotRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, SnapshotName = SnapshotName)
  
    __obj.asInstanceOf[CreateApplicationSnapshotRequest]
  }
}

