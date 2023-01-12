package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLoggerDefinitionVersionRequest extends StObject {
  
  /**
    * A client token used to correlate requests and responses.
    */
  var AmznClientToken: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: string
  
  /**
    * A list of loggers.
    */
  var Loggers: js.UndefOr[listOfLogger] = js.undefined
}
object CreateLoggerDefinitionVersionRequest {
  
  inline def apply(LoggerDefinitionId: string): CreateLoggerDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoggerDefinitionVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLoggerDefinitionVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setAmznClientToken(value: string): Self = StObject.set(x, "AmznClientToken", value.asInstanceOf[js.Any])
    
    inline def setAmznClientTokenUndefined: Self = StObject.set(x, "AmznClientToken", js.undefined)
    
    inline def setLoggerDefinitionId(value: string): Self = StObject.set(x, "LoggerDefinitionId", value.asInstanceOf[js.Any])
    
    inline def setLoggers(value: listOfLogger): Self = StObject.set(x, "Loggers", value.asInstanceOf[js.Any])
    
    inline def setLoggersUndefined: Self = StObject.set(x, "Loggers", js.undefined)
    
    inline def setLoggersVarargs(value: Logger*): Self = StObject.set(x, "Loggers", js.Array(value*))
  }
}
