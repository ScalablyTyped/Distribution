package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2InstanceLimit extends StObject {
  
  /**
    * The number of instances for the specified type and location that are currently being used by the Amazon Web Services account. 
    */
  var CurrentInstances: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The name of an Amazon EC2 instance type. See Amazon Elastic Compute Cloud Instance Types for detailed descriptions. 
    */
  var EC2InstanceType: js.UndefOr[typings.awsSdk.clientsGameliftMod.EC2InstanceType] = js.undefined
  
  /**
    * The number of instances that is allowed for the specified instance type and location.
    */
  var InstanceLimit: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * An Amazon Web Services Region code, such as us-west-2. 
    */
  var Location: js.UndefOr[LocationStringModel] = js.undefined
}
object EC2InstanceLimit {
  
  inline def apply(): EC2InstanceLimit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2InstanceLimit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EC2InstanceLimit] (val x: Self) extends AnyVal {
    
    inline def setCurrentInstances(value: WholeNumber): Self = StObject.set(x, "CurrentInstances", value.asInstanceOf[js.Any])
    
    inline def setCurrentInstancesUndefined: Self = StObject.set(x, "CurrentInstances", js.undefined)
    
    inline def setEC2InstanceType(value: EC2InstanceType): Self = StObject.set(x, "EC2InstanceType", value.asInstanceOf[js.Any])
    
    inline def setEC2InstanceTypeUndefined: Self = StObject.set(x, "EC2InstanceType", js.undefined)
    
    inline def setInstanceLimit(value: WholeNumber): Self = StObject.set(x, "InstanceLimit", value.asInstanceOf[js.Any])
    
    inline def setInstanceLimitUndefined: Self = StObject.set(x, "InstanceLimit", js.undefined)
    
    inline def setLocation(value: LocationStringModel): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
  }
}
