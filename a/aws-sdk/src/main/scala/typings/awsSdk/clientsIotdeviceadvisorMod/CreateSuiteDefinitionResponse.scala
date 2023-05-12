package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSuiteDefinitionResponse extends StObject {
  
  /**
    * The timestamp of when the test suite was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the test suite.
    */
  var suiteDefinitionArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The UUID of the test suite created.
    */
  var suiteDefinitionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * The suite definition name of the test suite. This is a required parameter.
    */
  var suiteDefinitionName: js.UndefOr[SuiteDefinitionName] = js.undefined
}
object CreateSuiteDefinitionResponse {
  
  inline def apply(): CreateSuiteDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSuiteDefinitionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSuiteDefinitionResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setSuiteDefinitionArn(value: AmazonResourceName): Self = StObject.set(x, "suiteDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionArnUndefined: Self = StObject.set(x, "suiteDefinitionArn", js.undefined)
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionIdUndefined: Self = StObject.set(x, "suiteDefinitionId", js.undefined)
    
    inline def setSuiteDefinitionName(value: SuiteDefinitionName): Self = StObject.set(x, "suiteDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionNameUndefined: Self = StObject.set(x, "suiteDefinitionName", js.undefined)
  }
}
