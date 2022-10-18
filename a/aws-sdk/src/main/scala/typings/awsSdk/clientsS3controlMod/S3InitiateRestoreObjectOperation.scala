package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3InitiateRestoreObjectOperation extends StObject {
  
  /**
    * This argument specifies how long the S3 Glacier or S3 Glacier Deep Archive object remains available in Amazon S3. S3 Initiate Restore Object jobs that target S3 Glacier and S3 Glacier Deep Archive objects require ExpirationInDays set to 1 or greater. Conversely, do not set ExpirationInDays when creating S3 Initiate Restore Object jobs that target S3 Intelligent-Tiering Archive Access and Deep Archive Access tier objects. Objects in S3 Intelligent-Tiering archive access tiers are not subject to restore expiry, so specifying ExpirationInDays results in restore request failure. S3 Batch Operations jobs can operate either on S3 Glacier and S3 Glacier Deep Archive storage class objects or on S3 Intelligent-Tiering Archive Access and Deep Archive Access storage tier objects, but not both types in the same job. If you need to restore objects of both types you must create separate Batch Operations jobs. 
    */
  var ExpirationInDays: js.UndefOr[S3ExpirationInDays] = js.undefined
  
  /**
    * S3 Batch Operations supports STANDARD and BULK retrieval tiers, but not the EXPEDITED retrieval tier.
    */
  var GlacierJobTier: js.UndefOr[S3GlacierJobTier] = js.undefined
}
object S3InitiateRestoreObjectOperation {
  
  inline def apply(): S3InitiateRestoreObjectOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3InitiateRestoreObjectOperation]
  }
  
  extension [Self <: S3InitiateRestoreObjectOperation](x: Self) {
    
    inline def setExpirationInDays(value: S3ExpirationInDays): Self = StObject.set(x, "ExpirationInDays", value.asInstanceOf[js.Any])
    
    inline def setExpirationInDaysUndefined: Self = StObject.set(x, "ExpirationInDays", js.undefined)
    
    inline def setGlacierJobTier(value: S3GlacierJobTier): Self = StObject.set(x, "GlacierJobTier", value.asInstanceOf[js.Any])
    
    inline def setGlacierJobTierUndefined: Self = StObject.set(x, "GlacierJobTier", js.undefined)
  }
}
