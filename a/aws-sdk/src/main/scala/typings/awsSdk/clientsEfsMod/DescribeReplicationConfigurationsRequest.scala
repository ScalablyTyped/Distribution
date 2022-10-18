package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeReplicationConfigurationsRequest extends StObject {
  
  /**
    * You can retrieve the replication configuration for a specific file system by providing its file system ID.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.clientsEfsMod.FileSystemId] = js.undefined
  
  /**
    * (Optional) To limit the number of objects returned in a response, you can specify the MaxItems parameter. The default value is 100. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsEfsMod.MaxResults] = js.undefined
  
  /**
    *  NextToken is present if the response is paginated. You can use NextToken in a subsequent request to fetch the next page of output.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object DescribeReplicationConfigurationsRequest {
  
  inline def apply(): DescribeReplicationConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeReplicationConfigurationsRequest]
  }
  
  extension [Self <: DescribeReplicationConfigurationsRequest](x: Self) {
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
