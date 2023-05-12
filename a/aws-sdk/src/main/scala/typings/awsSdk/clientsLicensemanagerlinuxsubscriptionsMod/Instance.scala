package typings.awsSdk.clientsLicensemanagerlinuxsubscriptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /**
    * The account ID which owns the instance.
    */
  var AccountID: js.UndefOr[String] = js.undefined
  
  /**
    * The AMI ID used to launch the instance.
    */
  var AmiId: js.UndefOr[String] = js.undefined
  
  /**
    * The instance ID of the resource.
    */
  var InstanceID: js.UndefOr[String] = js.undefined
  
  /**
    * The instance type of the resource.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The time in which the last discovery updated the instance details.
    */
  var LastUpdatedTime: js.UndefOr[String] = js.undefined
  
  /**
    * The product code for the instance. For more information, see Usage operation values in the License Manager User Guide .
    */
  var ProductCode: js.UndefOr[ProductCodeList] = js.undefined
  
  /**
    * The Region the instance is running in.
    */
  var Region: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the instance.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the subscription being used by the instance.
    */
  var SubscriptionName: js.UndefOr[String] = js.undefined
  
  /**
    * The usage operation of the instance. For more information, see For more information, see Usage operation values in the License Manager User Guide.
    */
  var UsageOperation: js.UndefOr[String] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
    
    inline def setAccountID(value: String): Self = StObject.set(x, "AccountID", value.asInstanceOf[js.Any])
    
    inline def setAccountIDUndefined: Self = StObject.set(x, "AccountID", js.undefined)
    
    inline def setAmiId(value: String): Self = StObject.set(x, "AmiId", value.asInstanceOf[js.Any])
    
    inline def setAmiIdUndefined: Self = StObject.set(x, "AmiId", js.undefined)
    
    inline def setInstanceID(value: String): Self = StObject.set(x, "InstanceID", value.asInstanceOf[js.Any])
    
    inline def setInstanceIDUndefined: Self = StObject.set(x, "InstanceID", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setLastUpdatedTime(value: String): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setProductCode(value: ProductCodeList): Self = StObject.set(x, "ProductCode", value.asInstanceOf[js.Any])
    
    inline def setProductCodeUndefined: Self = StObject.set(x, "ProductCode", js.undefined)
    
    inline def setProductCodeVarargs(value: String*): Self = StObject.set(x, "ProductCode", js.Array(value*))
    
    inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubscriptionName(value: String): Self = StObject.set(x, "SubscriptionName", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionNameUndefined: Self = StObject.set(x, "SubscriptionName", js.undefined)
    
    inline def setUsageOperation(value: String): Self = StObject.set(x, "UsageOperation", value.asInstanceOf[js.Any])
    
    inline def setUsageOperationUndefined: Self = StObject.set(x, "UsageOperation", js.undefined)
  }
}
