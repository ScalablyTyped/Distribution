package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTimeToLiveOutput extends StObject {
  
  /**
    * Represents the output of an UpdateTimeToLive operation.
    */
  var TimeToLiveSpecification: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TimeToLiveSpecification] = js.undefined
}
object UpdateTimeToLiveOutput {
  
  inline def apply(): UpdateTimeToLiveOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTimeToLiveOutput]
  }
  
  extension [Self <: UpdateTimeToLiveOutput](x: Self) {
    
    inline def setTimeToLiveSpecification(value: TimeToLiveSpecification): Self = StObject.set(x, "TimeToLiveSpecification", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveSpecificationUndefined: Self = StObject.set(x, "TimeToLiveSpecification", js.undefined)
  }
}
