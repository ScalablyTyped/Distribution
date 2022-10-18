package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSuiteDefinitionRequest extends StObject {
  
  /**
    * Suite definition ID of the test suite to get.
    */
  var suiteDefinitionId: UUID
  
  /**
    * Suite definition version of the test suite to get.
    */
  var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined
}
object GetSuiteDefinitionRequest {
  
  inline def apply(suiteDefinitionId: UUID): GetSuiteDefinitionRequest = {
    val __obj = js.Dynamic.literal(suiteDefinitionId = suiteDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSuiteDefinitionRequest]
  }
  
  extension [Self <: GetSuiteDefinitionRequest](x: Self) {
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionVersion(value: SuiteDefinitionVersion): Self = StObject.set(x, "suiteDefinitionVersion", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionVersionUndefined: Self = StObject.set(x, "suiteDefinitionVersion", js.undefined)
  }
}
