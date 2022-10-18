package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNetworkPolicyVersion extends StObject {
  
  /**
    * Whether a core network policy is the current policy or the most recently submitted policy.
    */
  var Alias: js.UndefOr[CoreNetworkPolicyAlias] = js.undefined
  
  /**
    * The status of the policy version change set.
    */
  var ChangeSetState: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.ChangeSetState] = js.undefined
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.CoreNetworkId] = js.undefined
  
  /**
    * The timestamp when a core network policy version was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of a core network policy version.
    */
  var Description: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The ID of the policy version.
    */
  var PolicyVersionId: js.UndefOr[Integer] = js.undefined
}
object CoreNetworkPolicyVersion {
  
  inline def apply(): CoreNetworkPolicyVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoreNetworkPolicyVersion]
  }
  
  extension [Self <: CoreNetworkPolicyVersion](x: Self) {
    
    inline def setAlias(value: CoreNetworkPolicyAlias): Self = StObject.set(x, "Alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "Alias", js.undefined)
    
    inline def setChangeSetState(value: ChangeSetState): Self = StObject.set(x, "ChangeSetState", value.asInstanceOf[js.Any])
    
    inline def setChangeSetStateUndefined: Self = StObject.set(x, "ChangeSetState", js.undefined)
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkIdUndefined: Self = StObject.set(x, "CoreNetworkId", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDescription(value: ConstrainedString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setPolicyVersionId(value: Integer): Self = StObject.set(x, "PolicyVersionId", value.asInstanceOf[js.Any])
    
    inline def setPolicyVersionIdUndefined: Self = StObject.set(x, "PolicyVersionId", js.undefined)
  }
}
