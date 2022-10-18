package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayPolicyTable extends StObject {
  
  /**
    * The timestamp when the transit gateway policy table was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the transit gateway policy table
    */
  var State: js.UndefOr[TransitGatewayPolicyTableState] = js.undefined
  
  /**
    * he key-value pairs associated with the transit gateway policy table.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayId] = js.undefined
  
  /**
    * The ID of the transit gateway policy table.
    */
  var TransitGatewayPolicyTableId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayPolicyTableId] = js.undefined
}
object TransitGatewayPolicyTable {
  
  inline def apply(): TransitGatewayPolicyTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPolicyTable]
  }
  
  extension [Self <: TransitGatewayPolicyTable](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setState(value: TransitGatewayPolicyTableState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    inline def setTransitGatewayPolicyTableId(value: TransitGatewayPolicyTableId): Self = StObject.set(x, "TransitGatewayPolicyTableId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayPolicyTableIdUndefined: Self = StObject.set(x, "TransitGatewayPolicyTableId", js.undefined)
  }
}
