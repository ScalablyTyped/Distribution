package typings.awsSdk.appsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetApiAssociationResponse extends StObject {
  
  /**
    * The ApiAssociation object.
    */
  var apiAssociation: js.UndefOr[ApiAssociation] = js.undefined
}
object GetApiAssociationResponse {
  
  inline def apply(): GetApiAssociationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetApiAssociationResponse]
  }
  
  extension [Self <: GetApiAssociationResponse](x: Self) {
    
    inline def setApiAssociation(value: ApiAssociation): Self = StObject.set(x, "apiAssociation", value.asInstanceOf[js.Any])
    
    inline def setApiAssociationUndefined: Self = StObject.set(x, "apiAssociation", js.undefined)
  }
}
