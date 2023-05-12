package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrafficSourcesResponse extends StObject {
  
  /**
    * This string indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  
  /**
    * Information about the traffic sources.
    */
  var TrafficSources: js.UndefOr[TrafficSourceStates] = js.undefined
}
object DescribeTrafficSourcesResponse {
  
  inline def apply(): DescribeTrafficSourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficSourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTrafficSourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTrafficSources(value: TrafficSourceStates): Self = StObject.set(x, "TrafficSources", value.asInstanceOf[js.Any])
    
    inline def setTrafficSourcesUndefined: Self = StObject.set(x, "TrafficSources", js.undefined)
    
    inline def setTrafficSourcesVarargs(value: TrafficSourceState*): Self = StObject.set(x, "TrafficSources", js.Array(value*))
  }
}
