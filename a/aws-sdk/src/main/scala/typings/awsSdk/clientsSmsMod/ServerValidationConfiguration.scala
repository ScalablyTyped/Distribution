package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerValidationConfiguration extends StObject {
  
  /**
    * The name of the configuration.
    */
  var name: js.UndefOr[NonEmptyStringWithMaxLen255] = js.undefined
  
  var server: js.UndefOr[Server] = js.undefined
  
  /**
    * The validation strategy.
    */
  var serverValidationStrategy: js.UndefOr[ServerValidationStrategy] = js.undefined
  
  /**
    * The validation parameters.
    */
  var userDataValidationParameters: js.UndefOr[UserDataValidationParameters] = js.undefined
  
  /**
    * The ID of the validation.
    */
  var validationId: js.UndefOr[ValidationId] = js.undefined
}
object ServerValidationConfiguration {
  
  inline def apply(): ServerValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerValidationConfiguration]
  }
  
  extension [Self <: ServerValidationConfiguration](x: Self) {
    
    inline def setName(value: NonEmptyStringWithMaxLen255): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    inline def setServerValidationStrategy(value: ServerValidationStrategy): Self = StObject.set(x, "serverValidationStrategy", value.asInstanceOf[js.Any])
    
    inline def setServerValidationStrategyUndefined: Self = StObject.set(x, "serverValidationStrategy", js.undefined)
    
    inline def setUserDataValidationParameters(value: UserDataValidationParameters): Self = StObject.set(x, "userDataValidationParameters", value.asInstanceOf[js.Any])
    
    inline def setUserDataValidationParametersUndefined: Self = StObject.set(x, "userDataValidationParameters", js.undefined)
    
    inline def setValidationId(value: ValidationId): Self = StObject.set(x, "validationId", value.asInstanceOf[js.Any])
    
    inline def setValidationIdUndefined: Self = StObject.set(x, "validationId", js.undefined)
  }
}
