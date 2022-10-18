package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayRouteTableAnnouncementsResult extends StObject {
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Describes the transit gateway route table announcement.
    */
  var TransitGatewayRouteTableAnnouncements: js.UndefOr[TransitGatewayRouteTableAnnouncementList] = js.undefined
}
object DescribeTransitGatewayRouteTableAnnouncementsResult {
  
  inline def apply(): DescribeTransitGatewayRouteTableAnnouncementsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayRouteTableAnnouncementsResult]
  }
  
  extension [Self <: DescribeTransitGatewayRouteTableAnnouncementsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayRouteTableAnnouncements(value: TransitGatewayRouteTableAnnouncementList): Self = StObject.set(x, "TransitGatewayRouteTableAnnouncements", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableAnnouncementsUndefined: Self = StObject.set(x, "TransitGatewayRouteTableAnnouncements", js.undefined)
    
    inline def setTransitGatewayRouteTableAnnouncementsVarargs(value: TransitGatewayRouteTableAnnouncement*): Self = StObject.set(x, "TransitGatewayRouteTableAnnouncements", js.Array(value*))
  }
}
