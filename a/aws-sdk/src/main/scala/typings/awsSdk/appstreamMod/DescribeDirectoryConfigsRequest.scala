package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDirectoryConfigsRequest extends StObject {
  
  /**
    * The directory names.
    */
  var DirectoryNames: js.UndefOr[DirectoryNameList] = js.native
  
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
}
object DescribeDirectoryConfigsRequest {
  
  @scala.inline
  def apply(): DescribeDirectoryConfigsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectoryConfigsRequest]
  }
  
  @scala.inline
  implicit class DescribeDirectoryConfigsRequestMutableBuilder[Self <: DescribeDirectoryConfigsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryNames(value: DirectoryNameList): Self = StObject.set(x, "DirectoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryNamesUndefined: Self = StObject.set(x, "DirectoryNames", js.undefined)
    
    @scala.inline
    def setDirectoryNamesVarargs(value: DirectoryName*): Self = StObject.set(x, "DirectoryNames", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
