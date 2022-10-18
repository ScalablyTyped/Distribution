package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDirectoriesRequest extends StObject {
  
  /**
    * A list of identifiers of the directories for which to obtain the information. If this member is null, all directories that belong to the current account are returned. An empty list results in an InvalidParameterException being thrown.
    */
  var DirectoryIds: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.DirectoryIds] = js.undefined
  
  /**
    * The maximum number of items to return. If this value is zero, the maximum number of items is specified by the limitations of the operation.
    */
  var Limit: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.Limit] = js.undefined
  
  /**
    * The DescribeDirectoriesResult.NextToken value from a previous call to DescribeDirectories. Pass null if this is the first call.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}
object DescribeDirectoriesRequest {
  
  inline def apply(): DescribeDirectoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectoriesRequest]
  }
  
  extension [Self <: DescribeDirectoriesRequest](x: Self) {
    
    inline def setDirectoryIds(value: DirectoryIds): Self = StObject.set(x, "DirectoryIds", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdsUndefined: Self = StObject.set(x, "DirectoryIds", js.undefined)
    
    inline def setDirectoryIdsVarargs(value: DirectoryId*): Self = StObject.set(x, "DirectoryIds", js.Array(value*))
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
