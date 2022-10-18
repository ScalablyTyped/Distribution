package typings.awsSdk.clientsSesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConfigurationSetsRequest extends StObject {
  
  /**
    * The number of configuration sets to return.
    */
  var MaxItems: js.UndefOr[typings.awsSdk.clientsSesMod.MaxItems] = js.undefined
  
  /**
    * A token returned from a previous call to ListConfigurationSets to indicate the position of the configuration set in the configuration set list.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSesMod.NextToken] = js.undefined
}
object ListConfigurationSetsRequest {
  
  inline def apply(): ListConfigurationSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConfigurationSetsRequest]
  }
  
  extension [Self <: ListConfigurationSetsRequest](x: Self) {
    
    inline def setMaxItems(value: MaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
