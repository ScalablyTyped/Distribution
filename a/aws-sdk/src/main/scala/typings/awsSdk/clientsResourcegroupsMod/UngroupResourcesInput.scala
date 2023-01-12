package typings.awsSdk.clientsResourcegroupsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UngroupResourcesInput extends StObject {
  
  /**
    * The name or the ARN of the resource group from which to remove the resources.
    */
  var Group: GroupString
  
  /**
    * The ARNs of the resources to be removed from the group.
    */
  var ResourceArns: ResourceArnList
}
object UngroupResourcesInput {
  
  inline def apply(Group: GroupString, ResourceArns: ResourceArnList): UngroupResourcesInput = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], ResourceArns = ResourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[UngroupResourcesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UngroupResourcesInput] (val x: Self) extends AnyVal {
    
    inline def setGroup(value: GroupString): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value*))
  }
}
