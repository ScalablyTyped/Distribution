package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSuiteRunRequest extends StObject {
  
  /**
    * Suite definition ID of the test suite.
    */
  var suiteDefinitionId: UUID
  
  /**
    * Suite definition version of the test suite.
    */
  var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined
  
  /**
    * Suite run configuration.
    */
  var suiteRunConfiguration: js.UndefOr[SuiteRunConfiguration] = js.undefined
  
  /**
    * The tags to be attached to the suite run.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object StartSuiteRunRequest {
  
  inline def apply(suiteDefinitionId: UUID): StartSuiteRunRequest = {
    val __obj = js.Dynamic.literal(suiteDefinitionId = suiteDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSuiteRunRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartSuiteRunRequest] (val x: Self) extends AnyVal {
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionVersion(value: SuiteDefinitionVersion): Self = StObject.set(x, "suiteDefinitionVersion", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionVersionUndefined: Self = StObject.set(x, "suiteDefinitionVersion", js.undefined)
    
    inline def setSuiteRunConfiguration(value: SuiteRunConfiguration): Self = StObject.set(x, "suiteRunConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSuiteRunConfigurationUndefined: Self = StObject.set(x, "suiteRunConfiguration", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
