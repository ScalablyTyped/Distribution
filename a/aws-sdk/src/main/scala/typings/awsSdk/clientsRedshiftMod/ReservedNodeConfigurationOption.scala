package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReservedNodeConfigurationOption extends StObject {
  
  var SourceReservedNode: js.UndefOr[ReservedNode] = js.undefined
  
  /**
    * The target reserved-node count.
    */
  var TargetReservedNodeCount: js.UndefOr[Integer] = js.undefined
  
  var TargetReservedNodeOffering: js.UndefOr[ReservedNodeOffering] = js.undefined
}
object ReservedNodeConfigurationOption {
  
  inline def apply(): ReservedNodeConfigurationOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservedNodeConfigurationOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReservedNodeConfigurationOption] (val x: Self) extends AnyVal {
    
    inline def setSourceReservedNode(value: ReservedNode): Self = StObject.set(x, "SourceReservedNode", value.asInstanceOf[js.Any])
    
    inline def setSourceReservedNodeUndefined: Self = StObject.set(x, "SourceReservedNode", js.undefined)
    
    inline def setTargetReservedNodeCount(value: Integer): Self = StObject.set(x, "TargetReservedNodeCount", value.asInstanceOf[js.Any])
    
    inline def setTargetReservedNodeCountUndefined: Self = StObject.set(x, "TargetReservedNodeCount", js.undefined)
    
    inline def setTargetReservedNodeOffering(value: ReservedNodeOffering): Self = StObject.set(x, "TargetReservedNodeOffering", value.asInstanceOf[js.Any])
    
    inline def setTargetReservedNodeOfferingUndefined: Self = StObject.set(x, "TargetReservedNodeOffering", js.undefined)
  }
}
