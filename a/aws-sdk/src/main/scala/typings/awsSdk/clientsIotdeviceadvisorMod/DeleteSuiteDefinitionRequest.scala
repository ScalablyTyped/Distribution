package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSuiteDefinitionRequest extends StObject {
  
  /**
    * Suite definition ID of the test suite to be deleted.
    */
  var suiteDefinitionId: UUID
}
object DeleteSuiteDefinitionRequest {
  
  inline def apply(suiteDefinitionId: UUID): DeleteSuiteDefinitionRequest = {
    val __obj = js.Dynamic.literal(suiteDefinitionId = suiteDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSuiteDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSuiteDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
  }
}
