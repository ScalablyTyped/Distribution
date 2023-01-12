package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobFailure extends StObject {
  
  /**
    * The failure code, if any, for the specified job.
    */
  var FailureCode: js.UndefOr[JobFailureCode] = js.undefined
  
  /**
    * The failure reason, if any, for the specified job.
    */
  var FailureReason: js.UndefOr[JobFailureReason] = js.undefined
}
object JobFailure {
  
  inline def apply(): JobFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobFailure] (val x: Self) extends AnyVal {
    
    inline def setFailureCode(value: JobFailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    inline def setFailureReason(value: JobFailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
  }
}
