package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource. For more information about ARNs and their format, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var ResourceArn: ArnString
}
object ListTagsForResourceRequest {
  
  inline def apply(ResourceArn: ArnString): ListTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceRequest] (val x: Self) extends AnyVal {
    
    inline def setResourceArn(value: ArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
