package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGatewayInput extends StObject {
  
  /**
    * The activation key of the created gateway.
    */
  var ActivationKey: typings.awsSdk.clientsBackupgatewayMod.ActivationKey
  
  /**
    * The display name of the created gateway.
    */
  var GatewayDisplayName: Name
  
  /**
    * The type of created gateway.
    */
  var GatewayType: typings.awsSdk.clientsBackupgatewayMod.GatewayType
  
  /**
    * A list of up to 50 tags to assign to the gateway. Each tag is a key-value pair.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsBackupgatewayMod.Tags] = js.undefined
}
object CreateGatewayInput {
  
  inline def apply(ActivationKey: ActivationKey, GatewayDisplayName: Name, GatewayType: GatewayType): CreateGatewayInput = {
    val __obj = js.Dynamic.literal(ActivationKey = ActivationKey.asInstanceOf[js.Any], GatewayDisplayName = GatewayDisplayName.asInstanceOf[js.Any], GatewayType = GatewayType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayInput]
  }
  
  extension [Self <: CreateGatewayInput](x: Self) {
    
    inline def setActivationKey(value: ActivationKey): Self = StObject.set(x, "ActivationKey", value.asInstanceOf[js.Any])
    
    inline def setGatewayDisplayName(value: Name): Self = StObject.set(x, "GatewayDisplayName", value.asInstanceOf[js.Any])
    
    inline def setGatewayType(value: GatewayType): Self = StObject.set(x, "GatewayType", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
