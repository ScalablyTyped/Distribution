package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIpRoutesResult extends StObject {
  
  /**
    * A list of IpRoutes.
    */
  var IpRoutesInfo: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.IpRoutesInfo] = js.undefined
  
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to ListIpRoutes to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}
object ListIpRoutesResult {
  
  inline def apply(): ListIpRoutesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIpRoutesResult]
  }
  
  extension [Self <: ListIpRoutesResult](x: Self) {
    
    inline def setIpRoutesInfo(value: IpRoutesInfo): Self = StObject.set(x, "IpRoutesInfo", value.asInstanceOf[js.Any])
    
    inline def setIpRoutesInfoUndefined: Self = StObject.set(x, "IpRoutesInfo", js.undefined)
    
    inline def setIpRoutesInfoVarargs(value: IpRouteInfo*): Self = StObject.set(x, "IpRoutesInfo", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
