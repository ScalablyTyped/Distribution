package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationStatus extends StObject {
  
  /**
    * The code that represents the status of the sensitive data detection.
    */
  var Code: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A longer description of the current status of the sensitive data detection.
    */
  var Reason: js.UndefOr[NonEmptyString] = js.undefined
}
object ClassificationStatus {
  
  inline def apply(): ClassificationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationStatus]
  }
  
  extension [Self <: ClassificationStatus](x: Self) {
    
    inline def setCode(value: NonEmptyString): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setReason(value: NonEmptyString): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
