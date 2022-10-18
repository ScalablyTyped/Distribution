package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLabelGroupRequest extends StObject {
  
  /**
    *  Returns the name of the label group. 
    */
  var LabelGroupName: typings.awsSdk.clientsLookoutequipmentMod.LabelGroupName
}
object DescribeLabelGroupRequest {
  
  inline def apply(LabelGroupName: LabelGroupName): DescribeLabelGroupRequest = {
    val __obj = js.Dynamic.literal(LabelGroupName = LabelGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLabelGroupRequest]
  }
  
  extension [Self <: DescribeLabelGroupRequest](x: Self) {
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
  }
}
