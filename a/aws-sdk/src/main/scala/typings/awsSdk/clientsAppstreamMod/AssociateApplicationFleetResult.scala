package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateApplicationFleetResult extends StObject {
  
  /**
    * If fleet name is specified, this returns the list of applications that are associated to it. If application ARN is specified, this returns the list of fleets to which it is associated.
    */
  var ApplicationFleetAssociation: js.UndefOr[typings.awsSdk.clientsAppstreamMod.ApplicationFleetAssociation] = js.undefined
}
object AssociateApplicationFleetResult {
  
  inline def apply(): AssociateApplicationFleetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateApplicationFleetResult]
  }
  
  extension [Self <: AssociateApplicationFleetResult](x: Self) {
    
    inline def setApplicationFleetAssociation(value: ApplicationFleetAssociation): Self = StObject.set(x, "ApplicationFleetAssociation", value.asInstanceOf[js.Any])
    
    inline def setApplicationFleetAssociationUndefined: Self = StObject.set(x, "ApplicationFleetAssociation", js.undefined)
  }
}
