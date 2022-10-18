package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var resourceArn: string
  
  /**
    * One or more tags (keys) to remove from the resource. In an HTTP request to remove multiple tags, append the tagKeys parameter and argument for each tag to remove, separated by an ampersand (&amp;).
    */
  var tagKeys: listOfString
}
object UntagResourceRequest {
  
  inline def apply(resourceArn: string, tagKeys: listOfString): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], tagKeys = tagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  extension [Self <: UntagResourceRequest](x: Self) {
    
    inline def setResourceArn(value: string): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: listOfString): Self = StObject.set(x, "tagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: string*): Self = StObject.set(x, "tagKeys", js.Array(value*))
  }
}
