package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeClientAuthenticationSettingsRequest extends StObject {
  
  /**
    * The identifier of the directory for which to retrieve information.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the limitations of the operation. 
    */
  var Limit: js.UndefOr[PageLimit] = js.undefined
  
  /**
    * The DescribeClientAuthenticationSettingsResult.NextToken value from a previous call to DescribeClientAuthenticationSettings. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  
  /**
    * The type of client authentication for which to retrieve information. If no type is specified, a list of all client authentication types that are supported for the specified directory is retrieved.
    */
  var Type: js.UndefOr[ClientAuthenticationType] = js.undefined
}
object DescribeClientAuthenticationSettingsRequest {
  
  inline def apply(DirectoryId: DirectoryId): DescribeClientAuthenticationSettingsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeClientAuthenticationSettingsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeClientAuthenticationSettingsRequest] (val x: Self) extends AnyVal {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: PageLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setType(value: ClientAuthenticationType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
