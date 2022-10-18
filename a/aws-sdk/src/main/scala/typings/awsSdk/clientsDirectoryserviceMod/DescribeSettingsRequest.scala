package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSettingsRequest extends StObject {
  
  /**
    * The identifier of the directory for which to retrieve information.
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    * The DescribeSettingsResult.NextToken value from a previous call to DescribeSettings. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  
  /**
    * The status of the directory settings for which to retrieve information.
    */
  var Status: js.UndefOr[DirectoryConfigurationStatus] = js.undefined
}
object DescribeSettingsRequest {
  
  inline def apply(DirectoryId: DirectoryId): DescribeSettingsRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSettingsRequest]
  }
  
  extension [Self <: DescribeSettingsRequest](x: Self) {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStatus(value: DirectoryConfigurationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
