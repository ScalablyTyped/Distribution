package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEngineVersionsResponse extends StObject {
  
  /**
    * A list of engine version details. Each element in the list contains detailed information about one engine version.
    */
  var EngineVersions: js.UndefOr[EngineVersionInfoList] = js.undefined
  
  /**
    * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeEngineVersionsResponse {
  
  inline def apply(): DescribeEngineVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEngineVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEngineVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setEngineVersions(value: EngineVersionInfoList): Self = StObject.set(x, "EngineVersions", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionsUndefined: Self = StObject.set(x, "EngineVersions", js.undefined)
    
    inline def setEngineVersionsVarargs(value: EngineVersionInfo*): Self = StObject.set(x, "EngineVersions", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
