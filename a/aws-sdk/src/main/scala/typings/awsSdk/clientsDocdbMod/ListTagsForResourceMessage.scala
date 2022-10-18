package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceMessage extends StObject {
  
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The Amazon DocumentDB resource with tags to be listed. This value is an Amazon Resource Name (ARN).
    */
  var ResourceName: String
}
object ListTagsForResourceMessage {
  
  inline def apply(ResourceName: String): ListTagsForResourceMessage = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceMessage]
  }
  
  extension [Self <: ListTagsForResourceMessage](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
  }
}
