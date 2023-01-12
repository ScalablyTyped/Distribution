package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventCategoriesMessage extends StObject {
  
  /**
    * Filters applied to the event categories.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    *  The type of DMS resource that generates events.  Valid values: replication-instance | replication-task
    */
  var SourceType: js.UndefOr[String] = js.undefined
}
object DescribeEventCategoriesMessage {
  
  inline def apply(): DescribeEventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventCategoriesMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEventCategoriesMessage] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setSourceType(value: String): Self = StObject.set(x, "SourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "SourceType", js.undefined)
  }
}
