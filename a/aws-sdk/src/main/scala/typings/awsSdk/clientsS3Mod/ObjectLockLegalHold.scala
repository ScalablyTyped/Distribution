package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLockLegalHold extends StObject {
  
  /**
    * Indicates whether the specified object has a legal hold in place.
    */
  var Status: js.UndefOr[ObjectLockLegalHoldStatus] = js.undefined
}
object ObjectLockLegalHold {
  
  inline def apply(): ObjectLockLegalHold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockLegalHold]
  }
  
  extension [Self <: ObjectLockLegalHold](x: Self) {
    
    inline def setStatus(value: ObjectLockLegalHoldStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
