package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplicationStatusType extends StObject {
  
  /**
    * Can be an ARN, Key ID, or Alias. 
    */
  var KmsKeyId: js.UndefOr[KmsKeyIdType] = js.undefined
  
  /**
    * The date that the secret was last accessed in the Region. This field is omitted if the secret has never been retrieved in the Region.
    */
  var LastAccessedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Region where replication occurs.
    */
  var Region: js.UndefOr[RegionType] = js.undefined
  
  /**
    * The status can be InProgress, Failed, or InSync.
    */
  var Status: js.UndefOr[StatusType] = js.undefined
  
  /**
    * Status message such as "Secret with this name already exists in this region".
    */
  var StatusMessage: js.UndefOr[StatusMessageType] = js.undefined
}
object ReplicationStatusType {
  
  inline def apply(): ReplicationStatusType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationStatusType]
  }
  
  extension [Self <: ReplicationStatusType](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyIdType): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLastAccessedDate(value: js.Date): Self = StObject.set(x, "LastAccessedDate", value.asInstanceOf[js.Any])
    
    inline def setLastAccessedDateUndefined: Self = StObject.set(x, "LastAccessedDate", js.undefined)
    
    inline def setRegion(value: RegionType): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setStatus(value: StatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessageType): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
