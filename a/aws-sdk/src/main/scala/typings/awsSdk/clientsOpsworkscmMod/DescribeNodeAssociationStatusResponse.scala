package typings.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNodeAssociationStatusResponse extends StObject {
  
  /**
    * Attributes specific to the node association. In Puppet, the attibute PUPPET_NODE_CERT contains the signed certificate (the result of the CSR). 
    */
  var EngineAttributes: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.EngineAttributes] = js.undefined
  
  /**
    * The status of the association or disassociation request.   Possible values:     SUCCESS: The association or disassociation succeeded.     FAILED: The association or disassociation failed.     IN_PROGRESS: The association or disassociation is still in progress.   
    */
  var NodeAssociationStatus: js.UndefOr[typings.awsSdk.clientsOpsworkscmMod.NodeAssociationStatus] = js.undefined
}
object DescribeNodeAssociationStatusResponse {
  
  inline def apply(): DescribeNodeAssociationStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNodeAssociationStatusResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeNodeAssociationStatusResponse] (val x: Self) extends AnyVal {
    
    inline def setEngineAttributes(value: EngineAttributes): Self = StObject.set(x, "EngineAttributes", value.asInstanceOf[js.Any])
    
    inline def setEngineAttributesUndefined: Self = StObject.set(x, "EngineAttributes", js.undefined)
    
    inline def setEngineAttributesVarargs(value: EngineAttribute*): Self = StObject.set(x, "EngineAttributes", js.Array(value*))
    
    inline def setNodeAssociationStatus(value: NodeAssociationStatus): Self = StObject.set(x, "NodeAssociationStatus", value.asInstanceOf[js.Any])
    
    inline def setNodeAssociationStatusUndefined: Self = StObject.set(x, "NodeAssociationStatus", js.undefined)
  }
}
