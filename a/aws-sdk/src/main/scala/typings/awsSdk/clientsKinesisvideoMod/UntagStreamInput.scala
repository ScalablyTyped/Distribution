package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagStreamInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.undefined
  
  /**
    * The name of the stream that you want to remove tags from.
    */
  var StreamName: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.StreamName] = js.undefined
  
  /**
    * A list of the keys of the tags that you want to remove.
    */
  var TagKeyList: typings.awsSdk.clientsKinesisvideoMod.TagKeyList
}
object UntagStreamInput {
  
  inline def apply(TagKeyList: TagKeyList): UntagStreamInput = {
    val __obj = js.Dynamic.literal(TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagStreamInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UntagStreamInput] (val x: Self) extends AnyVal {
    
    inline def setStreamARN(value: ResourceARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    inline def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
    
    inline def setStreamName(value: StreamName): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
    
    inline def setTagKeyList(value: TagKeyList): Self = StObject.set(x, "TagKeyList", value.asInstanceOf[js.Any])
    
    inline def setTagKeyListVarargs(value: TagKey*): Self = StObject.set(x, "TagKeyList", js.Array(value*))
  }
}
