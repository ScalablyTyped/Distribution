package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryPoint extends StObject {
  
  /**
    * The name of the namespace the recovery point is associated with.
    */
  var namespaceName: js.UndefOr[NamespaceName] = js.undefined
  
  /**
    * The time the recovery point is created.
    */
  var recoveryPointCreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique identifier of the recovery point.
    */
  var recoveryPointId: js.UndefOr[String] = js.undefined
  
  /**
    * The total size of the data in the recovery point in megabytes.
    */
  var totalSizeInMegaBytes: js.UndefOr[Double] = js.undefined
  
  /**
    * The name of the workgroup the recovery point is associated with.
    */
  var workgroupName: js.UndefOr[WorkgroupName] = js.undefined
}
object RecoveryPoint {
  
  inline def apply(): RecoveryPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryPoint]
  }
  
  extension [Self <: RecoveryPoint](x: Self) {
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setNamespaceNameUndefined: Self = StObject.set(x, "namespaceName", js.undefined)
    
    inline def setRecoveryPointCreateTime(value: js.Date): Self = StObject.set(x, "recoveryPointCreateTime", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointCreateTimeUndefined: Self = StObject.set(x, "recoveryPointCreateTime", js.undefined)
    
    inline def setRecoveryPointId(value: String): Self = StObject.set(x, "recoveryPointId", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointIdUndefined: Self = StObject.set(x, "recoveryPointId", js.undefined)
    
    inline def setTotalSizeInMegaBytes(value: Double): Self = StObject.set(x, "totalSizeInMegaBytes", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeInMegaBytesUndefined: Self = StObject.set(x, "totalSizeInMegaBytes", js.undefined)
    
    inline def setWorkgroupName(value: WorkgroupName): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupNameUndefined: Self = StObject.set(x, "workgroupName", js.undefined)
  }
}
