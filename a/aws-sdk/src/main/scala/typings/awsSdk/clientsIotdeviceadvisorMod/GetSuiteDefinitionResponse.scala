package typings.awsSdk.clientsIotdeviceadvisorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSuiteDefinitionResponse extends StObject {
  
  /**
    * Date (in Unix epoch time) when the suite definition was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Date (in Unix epoch time) when the suite definition was last modified.
    */
  var lastModifiedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Latest suite definition version of the suite definition.
    */
  var latestVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined
  
  /**
    * The ARN of the suite definition.
    */
  var suiteDefinitionArn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * Suite configuration of the suite definition.
    */
  var suiteDefinitionConfiguration: js.UndefOr[SuiteDefinitionConfiguration] = js.undefined
  
  /**
    * Suite definition ID of the suite definition.
    */
  var suiteDefinitionId: js.UndefOr[UUID] = js.undefined
  
  /**
    * Suite definition version of the suite definition.
    */
  var suiteDefinitionVersion: js.UndefOr[SuiteDefinitionVersion] = js.undefined
  
  /**
    * Tags attached to the suite definition.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object GetSuiteDefinitionResponse {
  
  inline def apply(): GetSuiteDefinitionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSuiteDefinitionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSuiteDefinitionResponse] (val x: Self) extends AnyVal {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setLastModifiedAt(value: js.Date): Self = StObject.set(x, "lastModifiedAt", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedAtUndefined: Self = StObject.set(x, "lastModifiedAt", js.undefined)
    
    inline def setLatestVersion(value: SuiteDefinitionVersion): Self = StObject.set(x, "latestVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionUndefined: Self = StObject.set(x, "latestVersion", js.undefined)
    
    inline def setSuiteDefinitionArn(value: AmazonResourceName): Self = StObject.set(x, "suiteDefinitionArn", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionArnUndefined: Self = StObject.set(x, "suiteDefinitionArn", js.undefined)
    
    inline def setSuiteDefinitionConfiguration(value: SuiteDefinitionConfiguration): Self = StObject.set(x, "suiteDefinitionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionConfigurationUndefined: Self = StObject.set(x, "suiteDefinitionConfiguration", js.undefined)
    
    inline def setSuiteDefinitionId(value: UUID): Self = StObject.set(x, "suiteDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionIdUndefined: Self = StObject.set(x, "suiteDefinitionId", js.undefined)
    
    inline def setSuiteDefinitionVersion(value: SuiteDefinitionVersion): Self = StObject.set(x, "suiteDefinitionVersion", value.asInstanceOf[js.Any])
    
    inline def setSuiteDefinitionVersionUndefined: Self = StObject.set(x, "suiteDefinitionVersion", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
