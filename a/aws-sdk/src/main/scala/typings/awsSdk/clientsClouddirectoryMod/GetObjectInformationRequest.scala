package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectInformationRequest extends StObject {
  
  /**
    * The consistency level at which to retrieve the object information.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsSdk.clientsClouddirectoryMod.ConsistencyLevel] = js.undefined
  
  /**
    * The ARN of the directory being retrieved.
    */
  var DirectoryArn: Arn
  
  /**
    * A reference to the object.
    */
  var ObjectReference: typings.awsSdk.clientsClouddirectoryMod.ObjectReference
}
object GetObjectInformationRequest {
  
  inline def apply(DirectoryArn: Arn, ObjectReference: ObjectReference): GetObjectInformationRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], ObjectReference = ObjectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectInformationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetObjectInformationRequest] (val x: Self) extends AnyVal {
    
    inline def setConsistencyLevel(value: ConsistencyLevel): Self = StObject.set(x, "ConsistencyLevel", value.asInstanceOf[js.Any])
    
    inline def setConsistencyLevelUndefined: Self = StObject.set(x, "ConsistencyLevel", js.undefined)
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setObjectReference(value: ObjectReference): Self = StObject.set(x, "ObjectReference", value.asInstanceOf[js.Any])
  }
}
