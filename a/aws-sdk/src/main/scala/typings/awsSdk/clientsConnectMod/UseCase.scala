package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseCase extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the use case.
    */
  var UseCaseArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier for the use case.
    */
  var UseCaseId: js.UndefOr[typings.awsSdk.clientsConnectMod.UseCaseId] = js.undefined
  
  /**
    * The type of use case to associate to the integration association. Each integration association can have only one of each use case type.
    */
  var UseCaseType: js.UndefOr[typings.awsSdk.clientsConnectMod.UseCaseType] = js.undefined
}
object UseCase {
  
  inline def apply(): UseCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseCase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UseCase] (val x: Self) extends AnyVal {
    
    inline def setUseCaseArn(value: ARN): Self = StObject.set(x, "UseCaseArn", value.asInstanceOf[js.Any])
    
    inline def setUseCaseArnUndefined: Self = StObject.set(x, "UseCaseArn", js.undefined)
    
    inline def setUseCaseId(value: UseCaseId): Self = StObject.set(x, "UseCaseId", value.asInstanceOf[js.Any])
    
    inline def setUseCaseIdUndefined: Self = StObject.set(x, "UseCaseId", js.undefined)
    
    inline def setUseCaseType(value: UseCaseType): Self = StObject.set(x, "UseCaseType", value.asInstanceOf[js.Any])
    
    inline def setUseCaseTypeUndefined: Self = StObject.set(x, "UseCaseType", js.undefined)
  }
}
