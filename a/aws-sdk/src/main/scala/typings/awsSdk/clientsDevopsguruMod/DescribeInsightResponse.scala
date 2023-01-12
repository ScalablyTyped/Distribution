package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInsightResponse extends StObject {
  
  /**
    *  A ProactiveInsight object that represents the requested insight. 
    */
  var ProactiveInsight: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ProactiveInsight] = js.undefined
  
  /**
    *  A ReactiveInsight object that represents the requested insight. 
    */
  var ReactiveInsight: js.UndefOr[typings.awsSdk.clientsDevopsguruMod.ReactiveInsight] = js.undefined
}
object DescribeInsightResponse {
  
  inline def apply(): DescribeInsightResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInsightResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInsightResponse] (val x: Self) extends AnyVal {
    
    inline def setProactiveInsight(value: ProactiveInsight): Self = StObject.set(x, "ProactiveInsight", value.asInstanceOf[js.Any])
    
    inline def setProactiveInsightUndefined: Self = StObject.set(x, "ProactiveInsight", js.undefined)
    
    inline def setReactiveInsight(value: ReactiveInsight): Self = StObject.set(x, "ReactiveInsight", value.asInstanceOf[js.Any])
    
    inline def setReactiveInsightUndefined: Self = StObject.set(x, "ReactiveInsight", js.undefined)
  }
}
