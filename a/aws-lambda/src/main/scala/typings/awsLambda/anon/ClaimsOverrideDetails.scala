package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimsOverrideDetails extends StObject {
  
  var claimsOverrideDetails: ClaimsToSuppress
}
object ClaimsOverrideDetails {
  
  inline def apply(claimsOverrideDetails: ClaimsToSuppress): ClaimsOverrideDetails = {
    val __obj = js.Dynamic.literal(claimsOverrideDetails = claimsOverrideDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimsOverrideDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClaimsOverrideDetails] (val x: Self) extends AnyVal {
    
    inline def setClaimsOverrideDetails(value: ClaimsToSuppress): Self = StObject.set(x, "claimsOverrideDetails", value.asInstanceOf[js.Any])
  }
}
