package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimsToAddOrOverride extends StObject {
  
  var claimsToAddOrOverride: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var claimsToSuppress: js.UndefOr[js.Array[String]] = js.undefined
  
  var groupOverrideDetails: js.UndefOr[Null | GroupsToOverride] = js.undefined
}
object ClaimsToAddOrOverride {
  
  inline def apply(): ClaimsToAddOrOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimsToAddOrOverride]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimsToAddOrOverride] (val x: Self) extends AnyVal {
    
    inline def setClaimsToAddOrOverride(value: StringDictionary[String]): Self = StObject.set(x, "claimsToAddOrOverride", value.asInstanceOf[js.Any])
    
    inline def setClaimsToAddOrOverrideUndefined: Self = StObject.set(x, "claimsToAddOrOverride", js.undefined)
    
    inline def setClaimsToSuppress(value: js.Array[String]): Self = StObject.set(x, "claimsToSuppress", value.asInstanceOf[js.Any])
    
    inline def setClaimsToSuppressUndefined: Self = StObject.set(x, "claimsToSuppress", js.undefined)
    
    inline def setClaimsToSuppressVarargs(value: String*): Self = StObject.set(x, "claimsToSuppress", js.Array(value*))
    
    inline def setGroupOverrideDetails(value: GroupsToOverride): Self = StObject.set(x, "groupOverrideDetails", value.asInstanceOf[js.Any])
    
    inline def setGroupOverrideDetailsNull: Self = StObject.set(x, "groupOverrideDetails", null)
    
    inline def setGroupOverrideDetailsUndefined: Self = StObject.set(x, "groupOverrideDetails", js.undefined)
  }
}
