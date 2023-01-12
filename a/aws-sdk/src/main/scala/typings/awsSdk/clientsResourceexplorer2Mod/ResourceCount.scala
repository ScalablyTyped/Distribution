package typings.awsSdk.clientsResourceexplorer2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceCount extends StObject {
  
  /**
    * Indicates whether the TotalResources value represents an exhaustive count of search results.   If True, it indicates that the search was exhaustive. Every resource that matches the query was counted.   If False, then the search reached the limit of 1,000 matching results, and stopped counting.  
    */
  var Complete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of resources that match the search query. This value can't exceed 1,000. If there are more than 1,000 resources that match the query, then only 1,000 are counted and the Complete field is set to false. We recommend that you refine your query to return a smaller number of results.
    */
  var TotalResources: js.UndefOr[Long] = js.undefined
}
object ResourceCount {
  
  inline def apply(): ResourceCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceCount] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "Complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "Complete", js.undefined)
    
    inline def setTotalResources(value: Long): Self = StObject.set(x, "TotalResources", value.asInstanceOf[js.Any])
    
    inline def setTotalResourcesUndefined: Self = StObject.set(x, "TotalResources", js.undefined)
  }
}
