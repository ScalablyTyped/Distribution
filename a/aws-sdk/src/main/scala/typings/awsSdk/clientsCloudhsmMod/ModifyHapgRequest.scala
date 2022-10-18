package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyHapgRequest extends StObject {
  
  /**
    * The ARN of the high-availability partition group to modify.
    */
  var HapgArn: typings.awsSdk.clientsCloudhsmMod.HapgArn
  
  /**
    * The new label for the high-availability partition group.
    */
  var Label: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.Label] = js.undefined
  
  /**
    * The list of partition serial numbers to make members of the high-availability partition group.
    */
  var PartitionSerialList: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.PartitionSerialList] = js.undefined
}
object ModifyHapgRequest {
  
  inline def apply(HapgArn: HapgArn): ModifyHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHapgRequest]
  }
  
  extension [Self <: ModifyHapgRequest](x: Self) {
    
    inline def setHapgArn(value: HapgArn): Self = StObject.set(x, "HapgArn", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setPartitionSerialList(value: PartitionSerialList): Self = StObject.set(x, "PartitionSerialList", value.asInstanceOf[js.Any])
    
    inline def setPartitionSerialListUndefined: Self = StObject.set(x, "PartitionSerialList", js.undefined)
    
    inline def setPartitionSerialListVarargs(value: PartitionSerial*): Self = StObject.set(x, "PartitionSerialList", js.Array(value*))
  }
}
