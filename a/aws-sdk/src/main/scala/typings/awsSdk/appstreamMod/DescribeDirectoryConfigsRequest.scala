package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDirectoryConfigsRequest extends StObject {
  
  /**
    * The directory names.
    */
  var DirectoryNames: js.UndefOr[DirectoryNameList] = js.undefined
  
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeDirectoryConfigsRequest {
  
  inline def apply(): DescribeDirectoryConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectoryConfigsRequest]
  }
  
  extension [Self <: DescribeDirectoryConfigsRequest](x: Self) {
    
    inline def setDirectoryNames(value: DirectoryNameList): Self = StObject.set(x, "DirectoryNames", value.asInstanceOf[js.Any])
    
    inline def setDirectoryNamesUndefined: Self = StObject.set(x, "DirectoryNames", js.undefined)
    
    inline def setDirectoryNamesVarargs(value: DirectoryName*): Self = StObject.set(x, "DirectoryNames", js.Array(value :_*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
