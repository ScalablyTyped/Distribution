package typings.awsLambda.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClaimsToAddOrOverride extends StObject {
  
  var claimsToAddOrOverride: js.UndefOr[StringDictionary[String]] = js.native
  
  var claimsToSuppress: js.UndefOr[js.Array[String]] = js.native
  
  var groupOverrideDetails: js.UndefOr[Null | GroupsToOverride] = js.native
}
object ClaimsToAddOrOverride {
  
  @scala.inline
  def apply(): ClaimsToAddOrOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClaimsToAddOrOverride]
  }
  
  @scala.inline
  implicit class ClaimsToAddOrOverrideMutableBuilder[Self <: ClaimsToAddOrOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClaimsToAddOrOverride(value: StringDictionary[String]): Self = StObject.set(x, "claimsToAddOrOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsToAddOrOverrideUndefined: Self = StObject.set(x, "claimsToAddOrOverride", js.undefined)
    
    @scala.inline
    def setClaimsToSuppress(value: js.Array[String]): Self = StObject.set(x, "claimsToSuppress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClaimsToSuppressUndefined: Self = StObject.set(x, "claimsToSuppress", js.undefined)
    
    @scala.inline
    def setClaimsToSuppressVarargs(value: String*): Self = StObject.set(x, "claimsToSuppress", js.Array(value :_*))
    
    @scala.inline
    def setGroupOverrideDetails(value: GroupsToOverride): Self = StObject.set(x, "groupOverrideDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupOverrideDetailsNull: Self = StObject.set(x, "groupOverrideDetails", null)
    
    @scala.inline
    def setGroupOverrideDetailsUndefined: Self = StObject.set(x, "groupOverrideDetails", js.undefined)
  }
}
