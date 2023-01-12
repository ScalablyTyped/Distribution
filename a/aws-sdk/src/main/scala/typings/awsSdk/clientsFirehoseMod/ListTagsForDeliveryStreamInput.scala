package typings.awsSdk.clientsFirehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForDeliveryStreamInput extends StObject {
  
  /**
    * The name of the delivery stream whose tags you want to list.
    */
  var DeliveryStreamName: typings.awsSdk.clientsFirehoseMod.DeliveryStreamName
  
  /**
    * The key to use as the starting point for the list of tags. If you set this parameter, ListTagsForDeliveryStream gets all tags that occur after ExclusiveStartTagKey.
    */
  var ExclusiveStartTagKey: js.UndefOr[TagKey] = js.undefined
  
  /**
    * The number of tags to return. If this number is less than the total number of tags associated with the delivery stream, HasMoreTags is set to true in the response. To list additional tags, set ExclusiveStartTagKey to the last key in the response. 
    */
  var Limit: js.UndefOr[ListTagsForDeliveryStreamInputLimit] = js.undefined
}
object ListTagsForDeliveryStreamInput {
  
  inline def apply(DeliveryStreamName: DeliveryStreamName): ListTagsForDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForDeliveryStreamInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForDeliveryStreamInput] (val x: Self) extends AnyVal {
    
    inline def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartTagKey(value: TagKey): Self = StObject.set(x, "ExclusiveStartTagKey", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartTagKeyUndefined: Self = StObject.set(x, "ExclusiveStartTagKey", js.undefined)
    
    inline def setLimit(value: ListTagsForDeliveryStreamInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
  }
}
