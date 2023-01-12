package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateLinkResponse extends StObject {
  
  /**
    * The link association.
    */
  var LinkAssociation: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.LinkAssociation] = js.undefined
}
object AssociateLinkResponse {
  
  inline def apply(): AssociateLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateLinkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateLinkResponse] (val x: Self) extends AnyVal {
    
    inline def setLinkAssociation(value: LinkAssociation): Self = StObject.set(x, "LinkAssociation", value.asInstanceOf[js.Any])
    
    inline def setLinkAssociationUndefined: Self = StObject.set(x, "LinkAssociation", js.undefined)
  }
}
