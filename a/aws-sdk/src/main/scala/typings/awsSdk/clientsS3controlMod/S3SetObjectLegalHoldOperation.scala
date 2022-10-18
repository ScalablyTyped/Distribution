package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3SetObjectLegalHoldOperation extends StObject {
  
  /**
    * Contains the Object Lock legal hold status to be applied to all objects in the Batch Operations job.
    */
  var LegalHold: S3ObjectLockLegalHold
}
object S3SetObjectLegalHoldOperation {
  
  inline def apply(LegalHold: S3ObjectLockLegalHold): S3SetObjectLegalHoldOperation = {
    val __obj = js.Dynamic.literal(LegalHold = LegalHold.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3SetObjectLegalHoldOperation]
  }
  
  extension [Self <: S3SetObjectLegalHoldOperation](x: Self) {
    
    inline def setLegalHold(value: S3ObjectLockLegalHold): Self = StObject.set(x, "LegalHold", value.asInstanceOf[js.Any])
  }
}
