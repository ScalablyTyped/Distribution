package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPlatformVersionsResult extends StObject {
  
  /**
    * In a paginated request, if this value isn't null, it's the token that you can pass in a subsequent request to get the next response page.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Summary information about the platform versions.
    */
  var PlatformSummaryList: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.PlatformSummaryList] = js.undefined
}
object ListPlatformVersionsResult {
  
  inline def apply(): ListPlatformVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlatformVersionsResult]
  }
  
  extension [Self <: ListPlatformVersionsResult](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPlatformSummaryList(value: PlatformSummaryList): Self = StObject.set(x, "PlatformSummaryList", value.asInstanceOf[js.Any])
    
    inline def setPlatformSummaryListUndefined: Self = StObject.set(x, "PlatformSummaryList", js.undefined)
    
    inline def setPlatformSummaryListVarargs(value: PlatformSummary*): Self = StObject.set(x, "PlatformSummaryList", js.Array(value*))
  }
}
