package typings.awsSdk.clientsKafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCustomPluginsResponse extends StObject {
  
  /**
    * An array of custom plugin descriptions.
    */
  var customPlugins: js.UndefOr[listOfCustomPluginSummary] = js.undefined
  
  /**
    * If the response of a ListCustomPlugins operation is truncated, it will include a NextToken. Send this NextToken in a subsequent request to continue listing from where the previous operation left off.
    */
  var nextToken: js.UndefOr[string] = js.undefined
}
object ListCustomPluginsResponse {
  
  inline def apply(): ListCustomPluginsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCustomPluginsResponse]
  }
  
  extension [Self <: ListCustomPluginsResponse](x: Self) {
    
    inline def setCustomPlugins(value: listOfCustomPluginSummary): Self = StObject.set(x, "customPlugins", value.asInstanceOf[js.Any])
    
    inline def setCustomPluginsUndefined: Self = StObject.set(x, "customPlugins", js.undefined)
    
    inline def setCustomPluginsVarargs(value: CustomPluginSummary*): Self = StObject.set(x, "customPlugins", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
