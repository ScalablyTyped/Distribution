package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAccountHealthResponse extends StObject {
  
  /**
    *  Number of resources that DevOps Guru is monitoring in your Amazon Web Services account. 
    */
  var AnalyzedResourceCount: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.AnalyzedResourceCount] = js.undefined
  
  /**
    *  An integer that specifies the number of metrics that have been analyzed in your Amazon Web Services account. 
    */
  var MetricsAnalyzed: NumMetricsAnalyzed
  
  /**
    *  An integer that specifies the number of open proactive insights in your Amazon Web Services account. 
    */
  var OpenProactiveInsights: NumOpenProactiveInsights
  
  /**
    *  An integer that specifies the number of open reactive insights in your Amazon Web Services account. 
    */
  var OpenReactiveInsights: NumOpenReactiveInsights
  
  /**
    * The number of Amazon DevOps Guru resource analysis hours billed to the current Amazon Web Services account in the last hour. 
    */
  var ResourceHours: typings.awsSdk.clientsDevopsguruMod.ResourceHours
}
object DescribeAccountHealthResponse {
  
  inline def apply(
    MetricsAnalyzed: NumMetricsAnalyzed,
    OpenProactiveInsights: NumOpenProactiveInsights,
    OpenReactiveInsights: NumOpenReactiveInsights,
    ResourceHours: ResourceHours
  ): DescribeAccountHealthResponse = {
    val __obj = js.Dynamic.literal(MetricsAnalyzed = MetricsAnalyzed.asInstanceOf[js.Any], OpenProactiveInsights = OpenProactiveInsights.asInstanceOf[js.Any], OpenReactiveInsights = OpenReactiveInsights.asInstanceOf[js.Any], ResourceHours = ResourceHours.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAccountHealthResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAccountHealthResponse] (val x: Self) extends AnyVal {
    
    inline def setAnalyzedResourceCount(value: AnalyzedResourceCount): Self = StObject.set(x, "AnalyzedResourceCount", value.asInstanceOf[js.Any])
    
    inline def setAnalyzedResourceCountUndefined: Self = StObject.set(x, "AnalyzedResourceCount", js.undefined)
    
    inline def setMetricsAnalyzed(value: NumMetricsAnalyzed): Self = StObject.set(x, "MetricsAnalyzed", value.asInstanceOf[js.Any])
    
    inline def setOpenProactiveInsights(value: NumOpenProactiveInsights): Self = StObject.set(x, "OpenProactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setOpenReactiveInsights(value: NumOpenReactiveInsights): Self = StObject.set(x, "OpenReactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setResourceHours(value: ResourceHours): Self = StObject.set(x, "ResourceHours", value.asInstanceOf[js.Any])
  }
}
