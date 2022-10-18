package typings.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachObjectRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where objects reside. For more information, see arns.
    */
  var DirectoryArn: Arn
  
  /**
    * The link name associated with the object that needs to be detached.
    */
  var LinkName: typings.awsSdk.clientsClouddirectoryMod.LinkName
  
  /**
    * The parent reference from which the object with the specified link name is detached.
    */
  var ParentReference: ObjectReference
}
object DetachObjectRequest {
  
  inline def apply(DirectoryArn: Arn, LinkName: LinkName, ParentReference: ObjectReference): DetachObjectRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any], LinkName = LinkName.asInstanceOf[js.Any], ParentReference = ParentReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachObjectRequest]
  }
  
  extension [Self <: DetachObjectRequest](x: Self) {
    
    inline def setDirectoryArn(value: Arn): Self = StObject.set(x, "DirectoryArn", value.asInstanceOf[js.Any])
    
    inline def setLinkName(value: LinkName): Self = StObject.set(x, "LinkName", value.asInstanceOf[js.Any])
    
    inline def setParentReference(value: ObjectReference): Self = StObject.set(x, "ParentReference", value.asInstanceOf[js.Any])
  }
}
