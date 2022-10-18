package typings.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHapgResponse extends StObject {
  
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.HapgArn] = js.undefined
  
  /**
    * The serial number of the high-availability partition group.
    */
  var HapgSerial: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var HsmsLastActionFailed: js.UndefOr[HsmList] = js.undefined
  
  /**
    * 
    */
  var HsmsPendingDeletion: js.UndefOr[HsmList] = js.undefined
  
  /**
    * 
    */
  var HsmsPendingRegistration: js.UndefOr[HsmList] = js.undefined
  
  /**
    * The label for the high-availability partition group.
    */
  var Label: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.Label] = js.undefined
  
  /**
    * The date and time the high-availability partition group was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The list of partition serial numbers that belong to the high-availability partition group.
    */
  var PartitionSerialList: js.UndefOr[typings.awsSdk.clientsCloudhsmMod.PartitionSerialList] = js.undefined
  
  /**
    * The state of the high-availability partition group.
    */
  var State: js.UndefOr[CloudHsmObjectState] = js.undefined
}
object DescribeHapgResponse {
  
  inline def apply(): DescribeHapgResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeHapgResponse]
  }
  
  extension [Self <: DescribeHapgResponse](x: Self) {
    
    inline def setHapgArn(value: HapgArn): Self = StObject.set(x, "HapgArn", value.asInstanceOf[js.Any])
    
    inline def setHapgArnUndefined: Self = StObject.set(x, "HapgArn", js.undefined)
    
    inline def setHapgSerial(value: String): Self = StObject.set(x, "HapgSerial", value.asInstanceOf[js.Any])
    
    inline def setHapgSerialUndefined: Self = StObject.set(x, "HapgSerial", js.undefined)
    
    inline def setHsmsLastActionFailed(value: HsmList): Self = StObject.set(x, "HsmsLastActionFailed", value.asInstanceOf[js.Any])
    
    inline def setHsmsLastActionFailedUndefined: Self = StObject.set(x, "HsmsLastActionFailed", js.undefined)
    
    inline def setHsmsLastActionFailedVarargs(value: HsmArn*): Self = StObject.set(x, "HsmsLastActionFailed", js.Array(value*))
    
    inline def setHsmsPendingDeletion(value: HsmList): Self = StObject.set(x, "HsmsPendingDeletion", value.asInstanceOf[js.Any])
    
    inline def setHsmsPendingDeletionUndefined: Self = StObject.set(x, "HsmsPendingDeletion", js.undefined)
    
    inline def setHsmsPendingDeletionVarargs(value: HsmArn*): Self = StObject.set(x, "HsmsPendingDeletion", js.Array(value*))
    
    inline def setHsmsPendingRegistration(value: HsmList): Self = StObject.set(x, "HsmsPendingRegistration", value.asInstanceOf[js.Any])
    
    inline def setHsmsPendingRegistrationUndefined: Self = StObject.set(x, "HsmsPendingRegistration", js.undefined)
    
    inline def setHsmsPendingRegistrationVarargs(value: HsmArn*): Self = StObject.set(x, "HsmsPendingRegistration", js.Array(value*))
    
    inline def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    inline def setLastModifiedTimestamp(value: Timestamp): Self = StObject.set(x, "LastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimestampUndefined: Self = StObject.set(x, "LastModifiedTimestamp", js.undefined)
    
    inline def setPartitionSerialList(value: PartitionSerialList): Self = StObject.set(x, "PartitionSerialList", value.asInstanceOf[js.Any])
    
    inline def setPartitionSerialListUndefined: Self = StObject.set(x, "PartitionSerialList", js.undefined)
    
    inline def setPartitionSerialListVarargs(value: PartitionSerial*): Self = StObject.set(x, "PartitionSerialList", js.Array(value*))
    
    inline def setState(value: CloudHsmObjectState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
