package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsBackupBackupPlanLifecycleDetails extends StObject {
  
  /**
    * Specifies the number of days after creation that a recovery point is deleted. Must be greater than 90 days plus MoveToColdStorageAfterDays. 
    */
  var DeleteAfterDays: js.UndefOr[Long] = js.undefined
  
  /**
    * Specifies the number of days after creation that a recovery point is moved to cold storage. 
    */
  var MoveToColdStorageAfterDays: js.UndefOr[Long] = js.undefined
}
object AwsBackupBackupPlanLifecycleDetails {
  
  inline def apply(): AwsBackupBackupPlanLifecycleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsBackupBackupPlanLifecycleDetails]
  }
  
  extension [Self <: AwsBackupBackupPlanLifecycleDetails](x: Self) {
    
    inline def setDeleteAfterDays(value: Long): Self = StObject.set(x, "DeleteAfterDays", value.asInstanceOf[js.Any])
    
    inline def setDeleteAfterDaysUndefined: Self = StObject.set(x, "DeleteAfterDays", js.undefined)
    
    inline def setMoveToColdStorageAfterDays(value: Long): Self = StObject.set(x, "MoveToColdStorageAfterDays", value.asInstanceOf[js.Any])
    
    inline def setMoveToColdStorageAfterDaysUndefined: Self = StObject.set(x, "MoveToColdStorageAfterDays", js.undefined)
  }
}
