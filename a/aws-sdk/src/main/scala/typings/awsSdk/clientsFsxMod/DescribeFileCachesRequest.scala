package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFileCachesRequest extends StObject {
  
  /**
    * IDs of the caches whose descriptions you want to retrieve (String).
    */
  var FileCacheIds: js.UndefOr[typings.awsSdk.clientsFsxMod.FileCacheIds] = js.undefined
  
  var MaxResults: js.UndefOr[typings.awsSdk.clientsFsxMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsFsxMod.NextToken] = js.undefined
}
object DescribeFileCachesRequest {
  
  inline def apply(): DescribeFileCachesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFileCachesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFileCachesRequest] (val x: Self) extends AnyVal {
    
    inline def setFileCacheIds(value: FileCacheIds): Self = StObject.set(x, "FileCacheIds", value.asInstanceOf[js.Any])
    
    inline def setFileCacheIdsUndefined: Self = StObject.set(x, "FileCacheIds", js.undefined)
    
    inline def setFileCacheIdsVarargs(value: FileCacheId*): Self = StObject.set(x, "FileCacheIds", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
