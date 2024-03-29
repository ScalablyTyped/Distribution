package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateLinkResponse extends StObject {
  
  /**
    * Information about the link association.
    */
  var LinkAssociation: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.LinkAssociation] = js.undefined
}
object DisassociateLinkResponse {
  
  inline def apply(): DisassociateLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateLinkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateLinkResponse] (val x: Self) extends AnyVal {
    
    inline def setLinkAssociation(value: LinkAssociation): Self = StObject.set(x, "LinkAssociation", value.asInstanceOf[js.Any])
    
    inline def setLinkAssociationUndefined: Self = StObject.set(x, "LinkAssociation", js.undefined)
  }
}
