package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewayAttachmentsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the attachments.
    */
  var TransitGatewayAttachments: js.UndefOr[TransitGatewayAttachmentList] = js.undefined
}
object DescribeTransitGatewayAttachmentsResult {
  
  inline def apply(): DescribeTransitGatewayAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewayAttachmentsResult]
  }
  
  extension [Self <: DescribeTransitGatewayAttachmentsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayAttachments(value: TransitGatewayAttachmentList): Self = StObject.set(x, "TransitGatewayAttachments", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentsUndefined: Self = StObject.set(x, "TransitGatewayAttachments", js.undefined)
    
    inline def setTransitGatewayAttachmentsVarargs(value: TransitGatewayAttachment*): Self = StObject.set(x, "TransitGatewayAttachments", js.Array(value*))
  }
}
