package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSnapshotRecordSourceInfo extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date when the source instance or disk snapshot was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of objects describing a disk snapshot.
    */
  var diskSnapshotInfo: js.UndefOr[DiskSnapshotInfo] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
    */
  var fromResourceArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the snapshot's source instance or disk.
    */
  var fromResourceName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A list of objects describing an instance snapshot.
    */
  var instanceSnapshotInfo: js.UndefOr[InstanceSnapshotInfo] = js.undefined
  
  /**
    * The name of the source instance or disk snapshot.
    */
  var name: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Lightsail resource type (e.g., InstanceSnapshot or DiskSnapshot).
    */
  var resourceType: js.UndefOr[ExportSnapshotRecordSourceType] = js.undefined
}
object ExportSnapshotRecordSourceInfo {
  
  inline def apply(): ExportSnapshotRecordSourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSnapshotRecordSourceInfo]
  }
  
  extension [Self <: ExportSnapshotRecordSourceInfo](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setDiskSnapshotInfo(value: DiskSnapshotInfo): Self = StObject.set(x, "diskSnapshotInfo", value.asInstanceOf[js.Any])
    
    inline def setDiskSnapshotInfoUndefined: Self = StObject.set(x, "diskSnapshotInfo", js.undefined)
    
    inline def setFromResourceArn(value: NonEmptyString): Self = StObject.set(x, "fromResourceArn", value.asInstanceOf[js.Any])
    
    inline def setFromResourceArnUndefined: Self = StObject.set(x, "fromResourceArn", js.undefined)
    
    inline def setFromResourceName(value: NonEmptyString): Self = StObject.set(x, "fromResourceName", value.asInstanceOf[js.Any])
    
    inline def setFromResourceNameUndefined: Self = StObject.set(x, "fromResourceName", js.undefined)
    
    inline def setInstanceSnapshotInfo(value: InstanceSnapshotInfo): Self = StObject.set(x, "instanceSnapshotInfo", value.asInstanceOf[js.Any])
    
    inline def setInstanceSnapshotInfoUndefined: Self = StObject.set(x, "instanceSnapshotInfo", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceType(value: ExportSnapshotRecordSourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
