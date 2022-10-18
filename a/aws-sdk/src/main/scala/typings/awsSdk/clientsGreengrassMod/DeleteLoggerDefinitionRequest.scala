package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLoggerDefinitionRequest extends StObject {
  
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string
}
object DeleteLoggerDefinitionRequest {
  
  inline def apply(LoggerDefinitionId: string): DeleteLoggerDefinitionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLoggerDefinitionRequest]
  }
  
  extension [Self <: DeleteLoggerDefinitionRequest](x: Self) {
    
    inline def setLoggerDefinitionId(value: string): Self = StObject.set(x, "LoggerDefinitionId", value.asInstanceOf[js.Any])
  }
}
