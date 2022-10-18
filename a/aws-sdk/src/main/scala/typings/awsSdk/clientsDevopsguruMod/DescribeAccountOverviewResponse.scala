package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountOverviewResponse extends StObject {
  
  /**
    *  The Mean Time to Recover (MTTR) for all closed insights that were created during the time range passed in. 
    */
  var MeanTimeToRecoverInMilliseconds: typings.awsSdk.clientsDevopsguruMod.MeanTimeToRecoverInMilliseconds
  
  /**
    *  An integer that specifies the number of open proactive insights in your Amazon Web Services account that were created during the time range passed in. 
    */
  var ProactiveInsights: NumProactiveInsights
  
  /**
    *  An integer that specifies the number of open reactive insights in your Amazon Web Services account that were created during the time range passed in. 
    */
  var ReactiveInsights: NumReactiveInsights
}
object DescribeAccountOverviewResponse {
  
  inline def apply(
    MeanTimeToRecoverInMilliseconds: MeanTimeToRecoverInMilliseconds,
    ProactiveInsights: NumProactiveInsights,
    ReactiveInsights: NumReactiveInsights
  ): DescribeAccountOverviewResponse = {
    val __obj = js.Dynamic.literal(MeanTimeToRecoverInMilliseconds = MeanTimeToRecoverInMilliseconds.asInstanceOf[js.Any], ProactiveInsights = ProactiveInsights.asInstanceOf[js.Any], ReactiveInsights = ReactiveInsights.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountOverviewResponse]
  }
  
  extension [Self <: DescribeAccountOverviewResponse](x: Self) {
    
    inline def setMeanTimeToRecoverInMilliseconds(value: MeanTimeToRecoverInMilliseconds): Self = StObject.set(x, "MeanTimeToRecoverInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setProactiveInsights(value: NumProactiveInsights): Self = StObject.set(x, "ProactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setReactiveInsights(value: NumReactiveInsights): Self = StObject.set(x, "ReactiveInsights", value.asInstanceOf[js.Any])
  }
}
