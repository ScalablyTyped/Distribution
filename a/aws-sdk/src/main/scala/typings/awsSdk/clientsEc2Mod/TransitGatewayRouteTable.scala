package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayRouteTable extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates whether this is the default association route table for the transit gateway.
    */
  var DefaultAssociationRouteTable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether this is the default propagation route table for the transit gateway.
    */
  var DefaultPropagationRouteTable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The state of the transit gateway route table.
    */
  var State: js.UndefOr[TransitGatewayRouteTableState] = js.undefined
  
  /**
    * Any tags assigned to the route table.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[String] = js.undefined
}
object TransitGatewayRouteTable {
  
  inline def apply(): TransitGatewayRouteTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayRouteTable]
  }
  
  extension [Self <: TransitGatewayRouteTable](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDefaultAssociationRouteTable(value: Boolean): Self = StObject.set(x, "DefaultAssociationRouteTable", value.asInstanceOf[js.Any])
    
    inline def setDefaultAssociationRouteTableUndefined: Self = StObject.set(x, "DefaultAssociationRouteTable", js.undefined)
    
    inline def setDefaultPropagationRouteTable(value: Boolean): Self = StObject.set(x, "DefaultPropagationRouteTable", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropagationRouteTableUndefined: Self = StObject.set(x, "DefaultPropagationRouteTable", js.undefined)
    
    inline def setState(value: TransitGatewayRouteTableState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTransitGatewayId(value: String): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    inline def setTransitGatewayRouteTableId(value: String): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableId", js.undefined)
  }
}
