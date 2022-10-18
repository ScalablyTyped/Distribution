package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachPolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where both objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn
  
  /**
    * The reference that identifies the object to which the policy will be attached.
    */
  var ObjectReference: typings.awsSdk.clientsClouddirectoryMod.ObjectReference
  
  /**
    * The reference that is associated with the policy object.
    */
  var PolicyReference: ObjectReference
}
object AttachPolicyRequest {
  
  inline def apply(DirectoryArn: Arn, ObjectReference: ObjectReference, PolicyReference: ObjectReference): AttachPolicyRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any], PolicyReference = PolicyReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachPolicyRequest]
  }
  
  extension [Self <: AttachPolicyRequest](x: Self) {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
    
    inline def setPolicyReference(value: ObjectReference): Self = StObject.set(x, "PolicyReference", value.asInstanceOf[js.Any])
  }
}
