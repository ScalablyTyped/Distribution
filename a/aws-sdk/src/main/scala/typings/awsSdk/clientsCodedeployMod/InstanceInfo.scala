package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceInfo extends StObject {
  
  /**
    * If the on-premises instance was deregistered, the time at which the on-premises instance was deregistered.
    */
  var deregisterTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ARN of the IAM session associated with the on-premises instance.
    */
  var iamSessionArn: js.UndefOr[IamSessionArn] = js.undefined
  
  /**
    * The IAM user ARN associated with the on-premises instance.
    */
  var iamUserArn: js.UndefOr[IamUserArn] = js.undefined
  
  /**
    * The ARN of the on-premises instance.
    */
  var instanceArn: js.UndefOr[InstanceArn] = js.undefined
  
  /**
    * The name of the on-premises instance.
    */
  var instanceName: js.UndefOr[InstanceName] = js.undefined
  
  /**
    * The time at which the on-premises instance was registered.
    */
  var registerTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The tags currently associated with the on-premises instance.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object InstanceInfo {
  
  inline def apply(): InstanceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceInfo]
  }
  
  extension [Self <: InstanceInfo](x: Self) {
    
    inline def setDeregisterTime(value: js.Date): Self = StObject.set(x, "deregisterTime", value.asInstanceOf[js.Any])
    
    inline def setDeregisterTimeUndefined: Self = StObject.set(x, "deregisterTime", js.undefined)
    
    inline def setIamSessionArn(value: IamSessionArn): Self = StObject.set(x, "iamSessionArn", value.asInstanceOf[js.Any])
    
    inline def setIamSessionArnUndefined: Self = StObject.set(x, "iamSessionArn", js.undefined)
    
    inline def setIamUserArn(value: IamUserArn): Self = StObject.set(x, "iamUserArn", value.asInstanceOf[js.Any])
    
    inline def setIamUserArnUndefined: Self = StObject.set(x, "iamUserArn", js.undefined)
    
    inline def setInstanceArn(value: InstanceArn): Self = StObject.set(x, "instanceArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceArnUndefined: Self = StObject.set(x, "instanceArn", js.undefined)
    
    inline def setInstanceName(value: InstanceName): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    inline def setRegisterTime(value: js.Date): Self = StObject.set(x, "registerTime", value.asInstanceOf[js.Any])
    
    inline def setRegisterTimeUndefined: Self = StObject.set(x, "registerTime", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
