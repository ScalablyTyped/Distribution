package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventCategoriesResponse extends StObject {
  
  /**
    * A list of event categories.
    */
  var EventCategoryGroupList: js.UndefOr[typings.awsSdk.clientsDmsMod.EventCategoryGroupList] = js.undefined
}
object DescribeEventCategoriesResponse {
  
  inline def apply(): DescribeEventCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventCategoriesResponse]
  }
  
  extension [Self <: DescribeEventCategoriesResponse](x: Self) {
    
    inline def setEventCategoryGroupList(value: EventCategoryGroupList): Self = StObject.set(x, "EventCategoryGroupList", value.asInstanceOf[js.Any])
    
    inline def setEventCategoryGroupListUndefined: Self = StObject.set(x, "EventCategoryGroupList", js.undefined)
    
    inline def setEventCategoryGroupListVarargs(value: EventCategoryGroup*): Self = StObject.set(x, "EventCategoryGroupList", js.Array(value*))
  }
}
