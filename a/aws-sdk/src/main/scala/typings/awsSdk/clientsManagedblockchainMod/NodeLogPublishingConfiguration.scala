package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeLogPublishingConfiguration extends StObject {
  
  /**
    * Configuration properties for logging events associated with a node that is owned by a member of a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  var Fabric: js.UndefOr[NodeFabricLogPublishingConfiguration] = js.undefined
}
object NodeLogPublishingConfiguration {
  
  inline def apply(): NodeLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeLogPublishingConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeLogPublishingConfiguration] (val x: Self) extends AnyVal {
    
    inline def setFabric(value: NodeFabricLogPublishingConfiguration): Self = StObject.set(x, "Fabric", value.asInstanceOf[js.Any])
    
    inline def setFabricUndefined: Self = StObject.set(x, "Fabric", js.undefined)
  }
}
