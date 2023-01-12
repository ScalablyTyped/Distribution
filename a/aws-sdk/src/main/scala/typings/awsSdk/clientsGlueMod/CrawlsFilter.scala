package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrawlsFilter extends StObject {
  
  /**
    * A key used to filter the crawler runs for a specified crawler. Valid values for each of the field names are:    CRAWL_ID: A string representing the UUID identifier for a crawl.    STATE: A string representing the state of the crawl.    START_TIME and END_TIME: The epoch timestamp in milliseconds.    DPU_HOUR: The number of data processing unit (DPU) hours used for the crawl.  
    */
  var FieldName: js.UndefOr[typings.awsSdk.clientsGlueMod.FieldName] = js.undefined
  
  /**
    * The value provided for comparison on the crawl field. 
    */
  var FieldValue: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A defined comparator that operates on the value. The available operators are:    GT: Greater than.    GE: Greater than or equal to.    LT: Less than.    LE: Less than or equal to.    EQ: Equal to.    NE: Not equal to.  
    */
  var FilterOperator: js.UndefOr[typings.awsSdk.clientsGlueMod.FilterOperator] = js.undefined
}
object CrawlsFilter {
  
  inline def apply(): CrawlsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CrawlsFilter] (val x: Self) extends AnyVal {
    
    inline def setFieldName(value: FieldName): Self = StObject.set(x, "FieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "FieldName", js.undefined)
    
    inline def setFieldValue(value: GenericString): Self = StObject.set(x, "FieldValue", value.asInstanceOf[js.Any])
    
    inline def setFieldValueUndefined: Self = StObject.set(x, "FieldValue", js.undefined)
    
    inline def setFilterOperator(value: FilterOperator): Self = StObject.set(x, "FilterOperator", value.asInstanceOf[js.Any])
    
    inline def setFilterOperatorUndefined: Self = StObject.set(x, "FilterOperator", js.undefined)
  }
}
