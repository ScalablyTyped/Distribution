package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDirectoryConfigsResult extends StObject {
  
  /**
    * Information about the directory configurations. Note that although the response syntax in this topic includes the account password, this password is not returned in the actual response. 
    */
  var DirectoryConfigs: js.UndefOr[DirectoryConfigList] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeDirectoryConfigsResult {
  
  inline def apply(): DescribeDirectoryConfigsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDirectoryConfigsResult]
  }
  
  extension [Self <: DescribeDirectoryConfigsResult](x: Self) {
    
    inline def setDirectoryConfigs(value: DirectoryConfigList): Self = StObject.set(x, "DirectoryConfigs", value.asInstanceOf[js.Any])
    
    inline def setDirectoryConfigsUndefined: Self = StObject.set(x, "DirectoryConfigs", js.undefined)
    
    inline def setDirectoryConfigsVarargs(value: DirectoryConfig*): Self = StObject.set(x, "DirectoryConfigs", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
