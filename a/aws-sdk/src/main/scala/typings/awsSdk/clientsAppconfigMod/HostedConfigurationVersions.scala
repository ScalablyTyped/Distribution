package typings.awsSdk.clientsAppconfigMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedConfigurationVersions extends StObject {
  
  /**
    * The elements from this collection.
    */
  var Items: js.UndefOr[HostedConfigurationVersionSummaryList] = js.undefined
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAppconfigMod.NextToken] = js.undefined
}
object HostedConfigurationVersions {
  
  inline def apply(): HostedConfigurationVersions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HostedConfigurationVersions]
  }
  
  extension [Self <: HostedConfigurationVersions](x: Self) {
    
    inline def setItems(value: HostedConfigurationVersionSummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: HostedConfigurationVersionSummary*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
