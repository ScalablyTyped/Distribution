package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayGroup extends StObject {
  
  /**
    * The ARN of the gateway group.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.Arn] = js.undefined
  
  /**
    * The description of the gateway group.
    */
  var Description: js.UndefOr[GatewayGroupDescription] = js.undefined
  
  /**
    * The name of the gateway group.
    */
  var Name: js.UndefOr[GatewayGroupName] = js.undefined
}
object GatewayGroup {
  
  inline def apply(): GatewayGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayGroup]
  }
  
  extension [Self <: GatewayGroup](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: GatewayGroupDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: GatewayGroupName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
