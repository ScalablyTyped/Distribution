package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUseCaseResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the use case.
    */
  var UseCaseArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the use case.
    */
  var UseCaseId: js.UndefOr[typings.awsSdk.clientsConnectMod.UseCaseId] = js.undefined
}
object CreateUseCaseResponse {
  
  inline def apply(): CreateUseCaseResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateUseCaseResponse]
  }
  
  extension [Self <: CreateUseCaseResponse](x: Self) {
    
    inline def setUseCaseArn(value: ARN): Self = StObject.set(x, "UseCaseArn", value.asInstanceOf[js.Any])
    
    inline def setUseCaseArnUndefined: Self = StObject.set(x, "UseCaseArn", js.undefined)
    
    inline def setUseCaseId(value: UseCaseId): Self = StObject.set(x, "UseCaseId", value.asInstanceOf[js.Any])
    
    inline def setUseCaseIdUndefined: Self = StObject.set(x, "UseCaseId", js.undefined)
  }
}
