package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ObjectLockLegalHold extends StObject {
  
  /**
    * The Object Lock legal hold status to be applied to all objects in the Batch Operations job.
    */
  var Status: S3ObjectLockLegalHoldStatus
}
object S3ObjectLockLegalHold {
  
  inline def apply(Status: S3ObjectLockLegalHoldStatus): S3ObjectLockLegalHold = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3ObjectLockLegalHold]
  }
  
  extension [Self <: S3ObjectLockLegalHold](x: Self) {
    
    inline def setStatus(value: S3ObjectLockLegalHoldStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
