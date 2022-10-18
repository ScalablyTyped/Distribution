package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource. For more information about ARNs and their format, see Amazon Resource Names (ARNs) in the AWS General Reference.
    */
  var ResourceArn: ArnString
  
  /**
    * The tags to assign to the specified resource. Tag values can be empty, for example, "MyTagKey" : "". You can specify multiple key-value pairs in a single request, with an overall maximum of 50 tags added to each resource.
    */
  var Tags: InputTagMap
}
object TagResourceRequest {
  
  inline def apply(ResourceArn: ArnString, Tags: InputTagMap): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
  
  extension [Self <: TagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: ArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: InputTagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
  }
}
