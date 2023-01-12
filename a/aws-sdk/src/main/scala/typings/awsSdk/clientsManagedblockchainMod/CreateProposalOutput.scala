package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProposalOutput extends StObject {
  
  /**
    * The unique identifier of the proposal.
    */
  var ProposalId: js.UndefOr[ResourceIdString] = js.undefined
}
object CreateProposalOutput {
  
  inline def apply(): CreateProposalOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProposalOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProposalOutput] (val x: Self) extends AnyVal {
    
    inline def setProposalId(value: ResourceIdString): Self = StObject.set(x, "ProposalId", value.asInstanceOf[js.Any])
    
    inline def setProposalIdUndefined: Self = StObject.set(x, "ProposalId", js.undefined)
  }
}
