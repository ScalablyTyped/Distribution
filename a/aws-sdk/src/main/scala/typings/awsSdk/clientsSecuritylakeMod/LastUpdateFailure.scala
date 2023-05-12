package typings.awsSdk.clientsSecuritylakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastUpdateFailure extends StObject {
  
  /**
    * The reason code for the failure of the last UpdateDatalake or DeleteDatalake API request.
    */
  var code: js.UndefOr[String] = js.undefined
  
  /**
    * The reason for the failure of the last UpdateDatalakeor DeleteDatalake API request.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object LastUpdateFailure {
  
  inline def apply(): LastUpdateFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastUpdateFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LastUpdateFailure] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
