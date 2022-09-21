package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateApiResponse extends StObject {
  
  /**
    * The ApiAssociation object.
    */
  var apiAssociation: js.UndefOr[ApiAssociation] = js.undefined
}
object AssociateApiResponse {
  
  inline def apply(): AssociateApiResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateApiResponse]
  }
  
  extension [Self <: AssociateApiResponse](x: Self) {
    
    inline def setApiAssociation(value: ApiAssociation): Self = StObject.set(x, "apiAssociation", value.asInstanceOf[js.Any])
    
    inline def setApiAssociationUndefined: Self = StObject.set(x, "apiAssociation", js.undefined)
  }
}
