package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutResourceSetResponse extends StObject {
  
  /**
    * Details about the resource set.
    */
  var ResourceSet: typings.awsSdk.clientsFmsMod.ResourceSet
  
  /**
    * The Amazon Resource Name (ARN) of the resource set.
    */
  var ResourceSetArn: ResourceArn
}
object PutResourceSetResponse {
  
  inline def apply(ResourceSet: ResourceSet, ResourceSetArn: ResourceArn): PutResourceSetResponse = {
    val __obj = js.Dynamic.literal(ResourceSet = ResourceSet.asInstanceOf[js.Any], ResourceSetArn = ResourceSetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutResourceSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutResourceSetResponse] (val x: Self) extends AnyVal {
    
    inline def setResourceSet(value: ResourceSet): Self = StObject.set(x, "ResourceSet", value.asInstanceOf[js.Any])
    
    inline def setResourceSetArn(value: ResourceArn): Self = StObject.set(x, "ResourceSetArn", value.asInstanceOf[js.Any])
  }
}
