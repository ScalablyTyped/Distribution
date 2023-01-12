package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyRecommendationDetail extends StObject {
  
  /**
    * Determines whether this instance type is the Amazon Web Services default recommendation.
    */
  var TargetInstances: js.UndefOr[TargetInstancesList] = js.undefined
}
object ModifyRecommendationDetail {
  
  inline def apply(): ModifyRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyRecommendationDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyRecommendationDetail] (val x: Self) extends AnyVal {
    
    inline def setTargetInstances(value: TargetInstancesList): Self = StObject.set(x, "TargetInstances", value.asInstanceOf[js.Any])
    
    inline def setTargetInstancesUndefined: Self = StObject.set(x, "TargetInstances", js.undefined)
    
    inline def setTargetInstancesVarargs(value: TargetInstance*): Self = StObject.set(x, "TargetInstances", js.Array(value*))
  }
}
