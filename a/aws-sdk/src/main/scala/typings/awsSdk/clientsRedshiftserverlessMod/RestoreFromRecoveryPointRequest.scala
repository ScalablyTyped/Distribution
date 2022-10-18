package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreFromRecoveryPointRequest extends StObject {
  
  /**
    * The name of the namespace to restore data into.
    */
  var namespaceName: NamespaceName
  
  /**
    * The unique identifier of the recovery point to restore from.
    */
  var recoveryPointId: String
  
  /**
    * The name of the workgroup used to restore data.
    */
  var workgroupName: WorkgroupName
}
object RestoreFromRecoveryPointRequest {
  
  inline def apply(namespaceName: NamespaceName, recoveryPointId: String, workgroupName: WorkgroupName): RestoreFromRecoveryPointRequest = {
    val __obj = js.Dynamic.literal(namespaceName = namespaceName.asInstanceOf[js.Any], recoveryPointId = recoveryPointId.asInstanceOf[js.Any], workgroupName = workgroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreFromRecoveryPointRequest]
  }
  
  extension [Self <: RestoreFromRecoveryPointRequest](x: Self) {
    
    inline def setNamespaceName(value: NamespaceName): Self = StObject.set(x, "namespaceName", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointId(value: String): Self = StObject.set(x, "recoveryPointId", value.asInstanceOf[js.Any])
    
    inline def setWorkgroupName(value: WorkgroupName): Self = StObject.set(x, "workgroupName", value.asInstanceOf[js.Any])
  }
}
