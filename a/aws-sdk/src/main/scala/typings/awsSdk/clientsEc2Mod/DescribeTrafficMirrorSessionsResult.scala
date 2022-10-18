package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrafficMirrorSessionsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described. Alternatively, you can filter the results.
    */
  var TrafficMirrorSessions: js.UndefOr[TrafficMirrorSessionSet] = js.undefined
}
object DescribeTrafficMirrorSessionsResult {
  
  inline def apply(): DescribeTrafficMirrorSessionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficMirrorSessionsResult]
  }
  
  extension [Self <: DescribeTrafficMirrorSessionsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTrafficMirrorSessions(value: TrafficMirrorSessionSet): Self = StObject.set(x, "TrafficMirrorSessions", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorSessionsUndefined: Self = StObject.set(x, "TrafficMirrorSessions", js.undefined)
    
    inline def setTrafficMirrorSessionsVarargs(value: TrafficMirrorSession*): Self = StObject.set(x, "TrafficMirrorSessions", js.Array(value*))
  }
}
