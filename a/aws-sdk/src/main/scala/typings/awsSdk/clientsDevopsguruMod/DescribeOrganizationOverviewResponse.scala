package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOrganizationOverviewResponse extends StObject {
  
  /**
    * An integer that specifies the number of open proactive insights in your Amazon Web Services account.
    */
  var ProactiveInsights: NumProactiveInsights
  
  /**
    * An integer that specifies the number of open reactive insights in your Amazon Web Services account.
    */
  var ReactiveInsights: NumReactiveInsights
}
object DescribeOrganizationOverviewResponse {
  
  inline def apply(ProactiveInsights: NumProactiveInsights, ReactiveInsights: NumReactiveInsights): DescribeOrganizationOverviewResponse = {
    val __obj = js.Dynamic.literal(ProactiveInsights = ProactiveInsights.asInstanceOf[js.Any], ReactiveInsights = ReactiveInsights.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeOrganizationOverviewResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeOrganizationOverviewResponse] (val x: Self) extends AnyVal {
    
    inline def setProactiveInsights(value: NumProactiveInsights): Self = StObject.set(x, "ProactiveInsights", value.asInstanceOf[js.Any])
    
    inline def setReactiveInsights(value: NumReactiveInsights): Self = StObject.set(x, "ReactiveInsights", value.asInstanceOf[js.Any])
  }
}
