package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveContext extends StObject {
  
  /**
    * A list of contexts active for the request. A context can be activated when a previous intent is fulfilled, or by including the context in the request. If you don't specify a list of contexts, Amazon Lex V2 will use the current list of contexts for the session. If you specify an empty list, all contexts for the session are cleared. 
    */
  var contextAttributes: ActiveContextParametersMap
  
  /**
    * The name of the context.
    */
  var name: ActiveContextName
  
  /**
    * Indicates the number of turns or seconds that the context is active. Once the time to live expires, the context is no longer returned in a response.
    */
  var timeToLive: ActiveContextTimeToLive
}
object ActiveContext {
  
  inline def apply(
    contextAttributes: ActiveContextParametersMap,
    name: ActiveContextName,
    timeToLive: ActiveContextTimeToLive
  ): ActiveContext = {
    val __obj = js.Dynamic.literal(contextAttributes = contextAttributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timeToLive = timeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveContext]
  }
  
  extension [Self <: ActiveContext](x: Self) {
    
    inline def setContextAttributes(value: ActiveContextParametersMap): Self = StObject.set(x, "contextAttributes", value.asInstanceOf[js.Any])
    
    inline def setName(value: ActiveContextName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimeToLive(value: ActiveContextTimeToLive): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
  }
}
