package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContentModerationRequestMetadata extends StObject {
  
  /**
    * The aggregation method chosen for a GetContentModeration request.
    */
  var AggregateBy: js.UndefOr[ContentModerationAggregateBy] = js.undefined
  
  /**
    * The sorting method chosen for a GetContentModeration request.
    */
  var SortBy: js.UndefOr[ContentModerationSortBy] = js.undefined
}
object GetContentModerationRequestMetadata {
  
  inline def apply(): GetContentModerationRequestMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContentModerationRequestMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContentModerationRequestMetadata] (val x: Self) extends AnyVal {
    
    inline def setAggregateBy(value: ContentModerationAggregateBy): Self = StObject.set(x, "AggregateBy", value.asInstanceOf[js.Any])
    
    inline def setAggregateByUndefined: Self = StObject.set(x, "AggregateBy", js.undefined)
    
    inline def setSortBy(value: ContentModerationSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
  }
}
