package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFileSystemsRequest extends StObject {
  
  /**
    * IDs of the file systems whose descriptions you want to retrieve (String).
    */
  var FileSystemIds: js.UndefOr[typings.awsSdk.clientsFsxMod.FileSystemIds] = js.undefined
  
  /**
    * Maximum number of file systems to return in the response (integer). This parameter value must be greater than 0. The number of items that Amazon FSx returns is the minimum of the MaxResults parameter specified in the request and the service's internal maximum number of items per page.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsFsxMod.MaxResults] = js.undefined
  
  /**
    * Opaque pagination token returned from a previous DescribeFileSystems operation (String). If a token present, the operation continues the list from where the returning call left off.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsFsxMod.NextToken] = js.undefined
}
object DescribeFileSystemsRequest {
  
  inline def apply(): DescribeFileSystemsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileSystemsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFileSystemsRequest] (val x: Self) extends AnyVal {
    
    inline def setFileSystemIds(value: FileSystemIds): Self = StObject.set(x, "FileSystemIds", value.asInstanceOf[js.Any])
    
    inline def setFileSystemIdsUndefined: Self = StObject.set(x, "FileSystemIds", js.undefined)
    
    inline def setFileSystemIdsVarargs(value: FileSystemId*): Self = StObject.set(x, "FileSystemIds", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
