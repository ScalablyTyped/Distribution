package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSuiteDefinitionRequest extends StObject {
  
  /**
    * Updates a Device Advisor test suite with suite definition configuration.
    */
  var suiteDefinitionConfiguration: js.UndefOr[SuiteDefinitionConfiguration] = js.undefined
  
  /**
    * Suite definition ID of the test suite to be updated.
    */
  var suiteDefinitionId: UUID
}
object UpdateSuiteDefinitionRequest {
  
  inline def apply(suiteDefinitionId: UUID): UpdateSuiteDefinitionRequest = {
    val __obj = js.Dynamic.literal(suiteDefinitionId = suiteDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSuiteDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSuiteDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setSuiteDefinitionConfiguration(value: SuiteDefinitionConfiguration): Self = StObject.set(x, "suiteDefinitionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionConfigurationUndefined: Self = StObject.set(x, "suiteDefinitionConfiguration", js.undefined)
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
  }
}
