package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobRequest extends StObject {
  
  /**
    * The Job ID of the job to be cancelled.
    */
  var Id: string
}
object CancelJobRequest {
  
  inline def apply(Id: string): CancelJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRequest]
  }
  
  extension [Self <: CancelJobRequest](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
