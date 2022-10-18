package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartialFailure extends StObject {
  
  /**
    * The type of error.
    */
  var ExceptionType: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.ExceptionType] = js.undefined
  
  /**
    * The code of the error.
    */
  var FailureCode: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.FailureCode] = js.undefined
  
  /**
    * A description of the error.
    */
  var FailureDescription: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.FailureDescription] = js.undefined
  
  /**
    * The specified rule that could not be deleted.
    */
  var FailureResource: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.FailureResource] = js.undefined
}
object PartialFailure {
  
  inline def apply(): PartialFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFailure]
  }
  
  extension [Self <: PartialFailure](x: Self) {
    
    inline def setExceptionType(value: ExceptionType): Self = StObject.set(x, "ExceptionType", value.asInstanceOf[js.Any])
    
    inline def setExceptionTypeUndefined: Self = StObject.set(x, "ExceptionType", js.undefined)
    
    inline def setFailureCode(value: FailureCode): Self = StObject.set(x, "FailureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "FailureCode", js.undefined)
    
    inline def setFailureDescription(value: FailureDescription): Self = StObject.set(x, "FailureDescription", value.asInstanceOf[js.Any])
    
    inline def setFailureDescriptionUndefined: Self = StObject.set(x, "FailureDescription", js.undefined)
    
    inline def setFailureResource(value: FailureResource): Self = StObject.set(x, "FailureResource", value.asInstanceOf[js.Any])
    
    inline def setFailureResourceUndefined: Self = StObject.set(x, "FailureResource", js.undefined)
  }
}
