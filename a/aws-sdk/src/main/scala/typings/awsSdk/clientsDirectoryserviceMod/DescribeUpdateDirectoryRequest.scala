package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUpdateDirectoryRequest extends StObject {
  
  /**
    *  The unique identifier of the directory. 
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    *  The DescribeUpdateDirectoryResult. NextToken value from a previous call to DescribeUpdateDirectory. Pass null if this is the first call. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  
  /**
    *  The name of the Region. 
    */
  var RegionName: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.RegionName] = js.undefined
  
  /**
    *  The type of updates you want to describe for the directory. 
    */
  var UpdateType: typings.awsSdk.clientsDirectoryserviceMod.UpdateType
}
object DescribeUpdateDirectoryRequest {
  
  inline def apply(DirectoryId: DirectoryId, UpdateType: UpdateType): DescribeUpdateDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], UpdateType = UpdateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUpdateDirectoryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeUpdateDirectoryRequest] (val x: Self) extends AnyVal {
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegionName(value: RegionName): Self = StObject.set(x, "RegionName", value.asInstanceOf[js.Any])
    
    inline def setRegionNameUndefined: Self = StObject.set(x, "RegionName", js.undefined)
    
    inline def setUpdateType(value: UpdateType): Self = StObject.set(x, "UpdateType", value.asInstanceOf[js.Any])
  }
}
