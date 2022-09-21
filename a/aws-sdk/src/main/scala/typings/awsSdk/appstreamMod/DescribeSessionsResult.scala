package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSessionsResult extends StObject {
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If there are no more pages, this value is null.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the streaming sessions.
    */
  var Sessions: js.UndefOr[SessionList] = js.undefined
}
object DescribeSessionsResult {
  
  inline def apply(): DescribeSessionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSessionsResult]
  }
  
  extension [Self <: DescribeSessionsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSessions(value: SessionList): Self = StObject.set(x, "Sessions", value.asInstanceOf[js.Any])
    
    inline def setSessionsUndefined: Self = StObject.set(x, "Sessions", js.undefined)
    
    inline def setSessionsVarargs(value: Session*): Self = StObject.set(x, "Sessions", js.Array(value*))
  }
}
