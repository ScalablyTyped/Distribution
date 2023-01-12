package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventReference extends StObject {
  
  /**
    * The ID of a RelatedItem referenced in a TimelineEvent.
    */
  var relatedItemId: js.UndefOr[GeneratedId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Amazon Web Services resource referenced in a TimelineEvent.
    */
  var resource: js.UndefOr[Arn] = js.undefined
}
object EventReference {
  
  inline def apply(): EventReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventReference] (val x: Self) extends AnyVal {
    
    inline def setRelatedItemId(value: GeneratedId): Self = StObject.set(x, "relatedItemId", value.asInstanceOf[js.Any])
    
    inline def setRelatedItemIdUndefined: Self = StObject.set(x, "relatedItemId", js.undefined)
    
    inline def setResource(value: Arn): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
