package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccessPointsResponse extends StObject {
  
  /**
    * An array of access point descriptions.
    */
  var AccessPoints: js.UndefOr[AccessPointDescriptions] = js.undefined
  
  /**
    * Present if there are more access points than returned in the response. You can use the NextMarker in the subsequent request to fetch the additional descriptions.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object DescribeAccessPointsResponse {
  
  inline def apply(): DescribeAccessPointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccessPointsResponse]
  }
  
  extension [Self <: DescribeAccessPointsResponse](x: Self) {
    
    inline def setAccessPoints(value: AccessPointDescriptions): Self = StObject.set(x, "AccessPoints", value.asInstanceOf[js.Any])
    
    inline def setAccessPointsUndefined: Self = StObject.set(x, "AccessPoints", js.undefined)
    
    inline def setAccessPointsVarargs(value: AccessPointDescription*): Self = StObject.set(x, "AccessPoints", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
