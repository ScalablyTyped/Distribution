package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsageFeatureResult extends StObject {
  
  /**
    * The feature that generated the usage cost.
    */
  var Feature: js.UndefOr[UsageFeature] = js.undefined
  
  var Total: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.Total] = js.undefined
}
object UsageFeatureResult {
  
  inline def apply(): UsageFeatureResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UsageFeatureResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UsageFeatureResult] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: UsageFeature): Self = StObject.set(x, "Feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "Feature", js.undefined)
    
    inline def setTotal(value: Total): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTotalUndefined: Self = StObject.set(x, "Total", js.undefined)
  }
}
