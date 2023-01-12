package typings.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccessPointsRequest extends StObject {
  
  /**
    * (Optional) Specifies an EFS access point to describe in the response; mutually exclusive with FileSystemId.
    */
  var AccessPointId: js.UndefOr[typings.awsSdk.clientsEfsMod.AccessPointId] = js.undefined
  
  /**
    * (Optional) If you provide a FileSystemId, EFS returns all access points for that file system; mutually exclusive with AccessPointId.
    */
  var FileSystemId: js.UndefOr[typings.awsSdk.clientsEfsMod.FileSystemId] = js.undefined
  
  /**
    * (Optional) When retrieving all access points for a file system, you can optionally specify the MaxItems parameter to limit the number of objects returned in a response. The default value is 100. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsEfsMod.MaxResults] = js.undefined
  
  /**
    *  NextToken is present if the response is paginated. You can use NextMarker in the subsequent request to fetch the next page of access point descriptions.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object DescribeAccessPointsRequest {
  
  inline def apply(): DescribeAccessPointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccessPointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAccessPointsRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessPointId(value: AccessPointId): Self = StObject.set(x, "AccessPointId", value.asInstanceOf[js.Any])
    
    inline def setAccessPointIdUndefined: Self = StObject.set(x, "AccessPointId", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdUndefined: Self = StObject.set(x, "FileSystemId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
