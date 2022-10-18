package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkFabricAttributes extends StObject {
  
  /**
    * The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see Amazon Managed Blockchain Pricing.
    */
  var Edition: js.UndefOr[typings.awsSdk.clientsManagedblockchainMod.Edition] = js.undefined
  
  /**
    * The endpoint of the ordering service for the network.
    */
  var OrderingServiceEndpoint: js.UndefOr[String] = js.undefined
}
object NetworkFabricAttributes {
  
  inline def apply(): NetworkFabricAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFabricAttributes]
  }
  
  extension [Self <: NetworkFabricAttributes](x: Self) {
    
    inline def setEdition(value: Edition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    inline def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    inline def setOrderingServiceEndpoint(value: String): Self = StObject.set(x, "OrderingServiceEndpoint", value.asInstanceOf[js.Any])
    
    inline def setOrderingServiceEndpointUndefined: Self = StObject.set(x, "OrderingServiceEndpoint", js.undefined)
  }
}
