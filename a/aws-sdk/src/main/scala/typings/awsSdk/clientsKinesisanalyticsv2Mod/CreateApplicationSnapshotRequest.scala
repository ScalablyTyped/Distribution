package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApplicationSnapshotRequest extends StObject {
  
  /**
    * The name of an existing application
    */
  var ApplicationName: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  
  /**
    * An identifier for the application snapshot.
    */
  var SnapshotName: typings.awsSdk.clientsKinesisanalyticsv2Mod.SnapshotName
}
object CreateApplicationSnapshotRequest {
  
  inline def apply(ApplicationName: ApplicationName, SnapshotName: SnapshotName): CreateApplicationSnapshotRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationSnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateApplicationSnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotName(value: SnapshotName): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
  }
}
