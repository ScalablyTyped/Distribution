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
    * The token for the next set of items to return. (You received this token from a previous call.)
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
  
  extension [Self <: DescribeWarmPoolAnswer](x: Self) {
    
    inline def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWarmPoolConfiguration(value: WarmPoolConfiguration): Self = StObject.set(x, "WarmPoolConfiguration", value.asInstanceOf[js.Any])
    
    inline def setWarmPoolConfigurationUndefined: Self = StObject.set(x, "WarmPoolConfiguration", js.undefined)
  }
}
