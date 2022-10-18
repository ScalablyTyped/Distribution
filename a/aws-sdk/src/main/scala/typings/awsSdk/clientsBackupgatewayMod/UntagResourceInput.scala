package typings.awsSdk.clientsBackupgatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource from which to remove tags.
    */
  var ResourceARN: ResourceArn
  
  /**
    * The list of tag keys specifying which tags to remove.
    */
  var TagKeys: typings.awsSdk.clientsBackupgatewayMod.TagKeys
}
object UntagResourceInput {
  
  inline def apply(ResourceARN: ResourceArn, TagKeys: TagKeys): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  extension [Self <: UntagResourceInput](x: Self) {
    
    inline def setResourceARN(value: ResourceArn): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
    
    inline def setTagKeys(value: TagKeys): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    inline def setTagKeysVarargs(value: TagKey*): Self = StObject.set(x, "TagKeys", js.Array(value*))
  }
}
