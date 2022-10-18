package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateObjectAttributesRequest extends StObject {
  
  /**
    * The attributes update structure.
    */
  var AttributeUpdates: ObjectAttributeUpdateList
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn
  
  /**
    * The reference that identifies the object.
    */
  var ObjectReference: typings.awsSdk.clientsClouddirectoryMod.ObjectReference
}
object UpdateObjectAttributesRequest {
  
  inline def apply(AttributeUpdates: ObjectAttributeUpdateList, DirectoryArn: Arn, ObjectReference: ObjectReference): UpdateObjectAttributesRequest = {
    val __obj = js.Dynamic.literal(AttributeUpdates = AttributeUpdates.asInstanceOf[js.Any], DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateObjectAttributesRequest]
  }
  
  extension [Self <: UpdateObjectAttributesRequest](x: Self) {
    
    inline def setAttributeUpdates(value: ObjectAttributeUpdateList): Self = StObject.set(x, "AttributeUpdates", value.asInstanceOf[js.Any])
    
    inline def setAttributeUpdatesVarargs(value: ObjectAttributeUpdate*): Self = StObject.set(x, "AttributeUpdates", js.Array(value*))
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}
