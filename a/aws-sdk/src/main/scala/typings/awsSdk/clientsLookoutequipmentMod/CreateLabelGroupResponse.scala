package typings.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLabelGroupResponse extends StObject {
  
  /**
    *  The ARN of the label group that you have created. 
    */
  var LabelGroupArn: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.LabelGroupArn] = js.undefined
  
  /**
    *  The name of the label group that you have created. Data in this field will be retained for service usage. Follow best practices for the security of your data. 
    */
  var LabelGroupName: js.UndefOr[typings.awsSdk.clientsLookoutequipmentMod.LabelGroupName] = js.undefined
}
object CreateLabelGroupResponse {
  
  inline def apply(): CreateLabelGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLabelGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLabelGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setLabelGroupArn(value: LabelGroupArn): Self = StObject.set(x, "LabelGroupArn", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupArnUndefined: Self = StObject.set(x, "LabelGroupArn", js.undefined)
    
    inline def setLabelGroupName(value: LabelGroupName): Self = StObject.set(x, "LabelGroupName", value.asInstanceOf[js.Any])
    
    inline def setLabelGroupNameUndefined: Self = StObject.set(x, "LabelGroupName", js.undefined)
  }
}
