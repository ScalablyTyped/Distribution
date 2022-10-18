package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLoggerDefinitionRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * Information about the initial version of the logger definition.
    */
  var InitialVersion: js.UndefOr[LoggerDefinitionVersion] = js.undefined
  
  /**
    * The name of the logger definition.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * Tag(s) to add to the new resource.
    */
  var tags: js.UndefOr[Tags] = js.undefined
}
object CreateLoggerDefinitionRequest {
  
  inline def apply(): CreateLoggerDefinitionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLoggerDefinitionRequest]
  }
  
  extension [Self <: CreateLoggerDefinitionRequest](x: Self) {
    
    inline def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    inline def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    inline def setInitialVersion(value: LoggerDefinitionVersion): Self = StObject.set(x, "InitialVersion", value.asInstanceOf[js.Any])
    
    inline def setInitialVersionUndefined: Self = StObject.set(x, "InitialVersion", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
