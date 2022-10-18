package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLoggerDefinitionRequest extends StObject {
  
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string
  
  /**
    * The name of the definition.
    */
  var Name: js.UndefOr[string] = js.undefined
}
object UpdateLoggerDefinitionRequest {
  
  inline def apply(LoggerDefinitionId: string): UpdateLoggerDefinitionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLoggerDefinitionRequest]
  }
  
  extension [Self <: UpdateLoggerDefinitionRequest](x: Self) {
    
    inline def setLoggerDefinitionId(value: string): Self = StObject.set(x, "LoggerDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
