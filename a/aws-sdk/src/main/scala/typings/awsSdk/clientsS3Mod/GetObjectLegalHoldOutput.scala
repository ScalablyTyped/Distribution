package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectLegalHoldOutput extends StObject {
  
  /**
    * The current legal hold status for the specified object.
    */
  var LegalHold: js.UndefOr[ObjectLockLegalHold] = js.undefined
}
object GetObjectLegalHoldOutput {
  
  inline def apply(): GetObjectLegalHoldOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetObjectLegalHoldOutput]
  }
  
  extension [Self <: GetObjectLegalHoldOutput](x: Self) {
    
    inline def setLegalHold(value: ObjectLockLegalHold): Self = StObject.set(x, "LegalHold", value.asInstanceOf[js.Any])
    
    inline def setLegalHoldUndefined: Self = StObject.set(x, "LegalHold", js.undefined)
  }
}
