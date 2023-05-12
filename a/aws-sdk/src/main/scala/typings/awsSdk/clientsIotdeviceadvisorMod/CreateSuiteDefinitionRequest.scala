package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSuiteDefinitionRequest extends StObject {
  
  /**
    * Creates a Device Advisor test suite with suite definition configuration.
    */
  var suiteDefinitionConfiguration: SuiteDefinitionConfiguration
  
  /**
    * The tags to be attached to the suite definition.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateSuiteDefinitionRequest {
  
  inline def apply(suiteDefinitionConfiguration: SuiteDefinitionConfiguration): CreateSuiteDefinitionRequest = {
    val __obj = js.Dynamic.literal(suiteDefinitionConfiguration = suiteDefinitionConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSuiteDefinitionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSuiteDefinitionRequest] (val x: Self) extends AnyVal {
    
    inline def setSuiteDefinitionConfiguration(value: SuiteDefinitionConfiguration): Self = StObject.set(x, "suiteDefinitionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
