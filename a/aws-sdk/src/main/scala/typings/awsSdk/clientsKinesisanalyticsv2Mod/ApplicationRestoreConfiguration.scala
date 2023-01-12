package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationRestoreConfiguration extends StObject {
  
  /**
    * Specifies how the application should be restored.
    */
  var ApplicationRestoreType: typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationRestoreType
  
  /**
    * The identifier of an existing snapshot of application state to use to restart an application. The application uses this value if RESTORE_FROM_CUSTOM_SNAPSHOT is specified for the ApplicationRestoreType.
    */
  var SnapshotName: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.SnapshotName] = js.undefined
}
object ApplicationRestoreConfiguration {
  
  inline def apply(ApplicationRestoreType: ApplicationRestoreType): ApplicationRestoreConfiguration = {
    val __obj = js.Dynamic.literal(ApplicationRestoreType = ApplicationRestoreType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationRestoreConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationRestoreConfiguration] (val x: Self) extends AnyVal {
    
    inline def setApplicationRestoreType(value: ApplicationRestoreType): Self = StObject.set(x, "ApplicationRestoreType", value.asInstanceOf[js.Any])
    
    inline def setSnapshotName(value: SnapshotName): Self = StObject.set(x, "SnapshotName", value.asInstanceOf[js.Any])
    
    inline def setSnapshotNameUndefined: Self = StObject.set(x, "SnapshotName", js.undefined)
  }
}
