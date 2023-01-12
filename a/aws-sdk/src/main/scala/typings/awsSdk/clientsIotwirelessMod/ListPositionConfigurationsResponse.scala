package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPositionConfigurationsResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.NextToken] = js.undefined
  
  /**
    * A list of position configurations.
    */
  var PositionConfigurationList: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.PositionConfigurationList] = js.undefined
}
object ListPositionConfigurationsResponse {
  
  inline def apply(): ListPositionConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPositionConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPositionConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPositionConfigurationList(value: PositionConfigurationList): Self = StObject.set(x, "PositionConfigurationList", value.asInstanceOf[js.Any])
    
    inline def setPositionConfigurationListUndefined: Self = StObject.set(x, "PositionConfigurationList", js.undefined)
    
    inline def setPositionConfigurationListVarargs(value: PositionConfigurationItem*): Self = StObject.set(x, "PositionConfigurationList", js.Array(value*))
  }
}
