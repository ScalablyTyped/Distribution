package typings.awsLambda.anon

import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.StringMap
import typings.awsLambda.triggerCognitoUserPoolTriggerPreTokenGenerationMod.GroupOverrideDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimsToSuppress extends StObject {
  
  var claimsToAddOrOverride: js.UndefOr[StringMap] = js.undefined
  
  var claimsToSuppress: js.UndefOr[js.Array[String]] = js.undefined
  
  var groupOverrideDetails: js.UndefOr[GroupOverrideDetails] = js.undefined
}
object ClaimsToSuppress {
  
  inline def apply(): ClaimsToSuppress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimsToSuppress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimsToSuppress] (val x: Self) extends AnyVal {
    
    inline def setClaimsToAddOrOverride(value: StringMap): Self = StObject.set(x, "claimsToAddOrOverride", value.asInstanceOf[js.Any])
    
    inline def setClaimsToAddOrOverrideUndefined: Self = StObject.set(x, "claimsToAddOrOverride", js.undefined)
    
    inline def setClaimsToSuppress(value: js.Array[String]): Self = StObject.set(x, "claimsToSuppress", value.asInstanceOf[js.Any])
    
    inline def setClaimsToSuppressUndefined: Self = StObject.set(x, "claimsToSuppress", js.undefined)
    
    inline def setClaimsToSuppressVarargs(value: String*): Self = StObject.set(x, "claimsToSuppress", js.Array(value*))
    
    inline def setGroupOverrideDetails(value: GroupOverrideDetails): Self = StObject.set(x, "groupOverrideDetails", value.asInstanceOf[js.Any])
    
    inline def setGroupOverrideDetailsUndefined: Self = StObject.set(x, "groupOverrideDetails", js.undefined)
  }
}
