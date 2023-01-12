package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDirectConnectGatewayAttachmentsResult extends StObject {
  
  /**
    * The attachments.
    */
  var directConnectGatewayAttachments: js.UndefOr[DirectConnectGatewayAttachmentList] = js.undefined
  
  /**
    * The token to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeDirectConnectGatewayAttachmentsResult {
  
  inline def apply(): DescribeDirectConnectGatewayAttachmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectConnectGatewayAttachmentsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDirectConnectGatewayAttachmentsResult] (val x: Self) extends AnyVal {
    
    inline def setDirectConnectGatewayAttachments(value: DirectConnectGatewayAttachmentList): Self = StObject.set(x, "directConnectGatewayAttachments", value.asInstanceOf[js.Any])
    
    inline def setDirectConnectGatewayAttachmentsUndefined: Self = StObject.set(x, "directConnectGatewayAttachments", js.undefined)
    
    inline def setDirectConnectGatewayAttachmentsVarargs(value: DirectConnectGatewayAttachment*): Self = StObject.set(x, "directConnectGatewayAttachments", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
