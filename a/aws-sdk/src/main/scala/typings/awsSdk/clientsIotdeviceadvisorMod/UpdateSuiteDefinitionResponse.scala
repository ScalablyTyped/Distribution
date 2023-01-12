package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSuiteDefinitionResponse extends StObject {
  
  /**
    * Timestamp of when the test suite was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Timestamp of when the test suite was updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the updated test suite.
    */
  var suiteDefinitionArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Suite definition ID of the updated test suite.
    */
  var suiteDefinitionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * Suite definition name of the updated test suite.
    */
  var suiteDefinitionName: js.UndefOr[SuiteDefinitionName] = js.undefined
  
  /**
    * Suite definition version of the updated test suite.
    */
  var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined
}
object UpdateSuiteDefinitionResponse {
  
  inline def apply(): UpdateSuiteDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSuiteDefinitionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSuiteDefinitionResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setSuiteDefinitionArn(value: AmazonResourceName): Self = StObject.set(x, "suiteDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionArnUndefined: Self = StObject.set(x, "suiteDefinitionArn", js.undefined)
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionIdUndefined: Self = StObject.set(x, "suiteDefinitionId", js.undefined)
    
    inline def setSuiteDefinitionName(value: SuiteDefinitionName): Self = StObject.set(x, "suiteDefinitionName", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionNameUndefined: Self = StObject.set(x, "suiteDefinitionName", js.undefined)
    
    inline def setSuiteDefinitionVersion(value: SuiteDefinitionVersion): Self = StObject.set(x, "suiteDefinitionVersion", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionVersionUndefined: Self = StObject.set(x, "suiteDefinitionVersion", js.undefined)
  }
}
