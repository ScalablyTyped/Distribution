package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceGroupDetail extends StObject {
  
  /**
    * If specified, indicates that the instance group uses Spot Instances. This is the maximum price you are willing to pay for Spot Instances. Specify OnDemandPrice to set the amount equal to the On-Demand price, or specify an amount in USD.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The date/time the instance group was created.
    */
  var CreationDateTime: js.Date
  
  /**
    * The custom AMI ID to use for the provisioned instance group.
    */
  var CustomAmiId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The date/time the instance group was terminated.
    */
  var EndDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Unique identifier for the instance group.
    */
  var InstanceGroupId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * Target number of instances to run in the instance group.
    */
  var InstanceRequestCount: Integer
  
  /**
    * Instance group role in the cluster
    */
  var InstanceRole: InstanceRoleType
  
  /**
    * Actual count of running instances.
    */
  var InstanceRunningCount: Integer
  
  /**
    * Amazon EC2 instance type.
    */
  var InstanceType: typings.awsSdk.clientsEmrMod.InstanceType
  
  /**
    * Details regarding the state of the instance group.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.undefined
  
  /**
    * Market type of the Amazon EC2 instances used to create a cluster node.
    */
  var Market: MarketType
  
  /**
    * Friendly name for the instance group.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The date/time the instance group was available to the cluster.
    */
  var ReadyDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date/time the instance group was started.
    */
  var StartDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * State of instance group. The following values are no longer supported: STARTING, TERMINATED, and FAILED.
    */
  var State: InstanceGroupState
}
object InstanceGroupDetail {
  
  inline def apply(
    CreationDateTime: js.Date,
    InstanceRequestCount: Integer,
    InstanceRole: InstanceRoleType,
    InstanceRunningCount: Integer,
    InstanceType: InstanceType,
    Market: MarketType,
    State: InstanceGroupState
  ): InstanceGroupDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime.asInstanceOf[js.Any], InstanceRequestCount = InstanceRequestCount.asInstanceOf[js.Any], InstanceRole = InstanceRole.asInstanceOf[js.Any], InstanceRunningCount = InstanceRunningCount.asInstanceOf[js.Any], InstanceType = InstanceType.asInstanceOf[js.Any], Market = Market.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceGroupDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstanceGroupDetail] (val x: Self) extends AnyVal {
    
    inline def setBidPrice(value: XmlStringMaxLen256): Self = StObject.set(x, "BidPrice", value.asInstanceOf[js.Any])
    
    inline def setBidPriceUndefined: Self = StObject.set(x, "BidPrice", js.undefined)
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCustomAmiId(value: XmlStringMaxLen256): Self = StObject.set(x, "CustomAmiId", value.asInstanceOf[js.Any])
    
    inline def setCustomAmiIdUndefined: Self = StObject.set(x, "CustomAmiId", js.undefined)
    
    inline def setEndDateTime(value: js.Date): Self = StObject.set(x, "EndDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "EndDateTime", js.undefined)
    
    inline def setInstanceGroupId(value: XmlStringMaxLen256): Self = StObject.set(x, "InstanceGroupId", value.asInstanceOf[js.Any])
    
    inline def setInstanceGroupIdUndefined: Self = StObject.set(x, "InstanceGroupId", js.undefined)
    
    inline def setInstanceRequestCount(value: Integer): Self = StObject.set(x, "InstanceRequestCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceRole(value: InstanceRoleType): Self = StObject.set(x, "InstanceRole", value.asInstanceOf[js.Any])
    
    inline def setInstanceRunningCount(value: Integer): Self = StObject.set(x, "InstanceRunningCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setLastStateChangeReason(value: XmlString): Self = StObject.set(x, "LastStateChangeReason", value.asInstanceOf[js.Any])
    
    inline def setLastStateChangeReasonUndefined: Self = StObject.set(x, "LastStateChangeReason", js.undefined)
    
    inline def setMarket(value: MarketType): Self = StObject.set(x, "Market", value.asInstanceOf[js.Any])
    
    inline def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setReadyDateTime(value: js.Date): Self = StObject.set(x, "ReadyDateTime", value.asInstanceOf[js.Any])
    
    inline def setReadyDateTimeUndefined: Self = StObject.set(x, "ReadyDateTime", js.undefined)
    
    inline def setStartDateTime(value: js.Date): Self = StObject.set(x, "StartDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "StartDateTime", js.undefined)
    
    inline def setState(value: InstanceGroupState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
  }
}
