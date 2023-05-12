package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWarmPoolAnswer extends StObject {
  
  /**
    * The instances that are currently in the warm pool.
    */
  var Instances: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Instances] = js.undefined
  
  /**
    * This string indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
  
  /**
    * The warm pool configuration details. 
    */
  var WarmPoolConfiguration: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.WarmPoolConfiguration] = js.undefined
}
object DescribeWarmPoolAnswer {
  
  inline def apply(): DescribeWarmPoolAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWarmPoolAnswer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWarmPoolAnswer] (val x: Self) extends AnyVal {
    
    inline def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWarmPoolConfiguration(value: WarmPoolConfiguration): Self = StObject.set(x, "WarmPoolConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWarmPoolConfigurationUndefined: Self = StObject.set(x, "WarmPoolConfiguration", js.undefined)
  }
}
