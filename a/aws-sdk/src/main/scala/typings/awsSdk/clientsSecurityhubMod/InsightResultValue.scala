package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InsightResultValue extends StObject {
  
  /**
    * The number of findings returned for each GroupByAttributeValue.
    */
  var Count: Integer
  
  /**
    * The value of the attribute that the findings are grouped by for the insight whose results are returned by the GetInsightResults operation.
    */
  var GroupByAttributeValue: NonEmptyString
}
object InsightResultValue {
  
  inline def apply(Count: Integer, GroupByAttributeValue: NonEmptyString): InsightResultValue = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], GroupByAttributeValue = GroupByAttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightResultValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InsightResultValue] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setGroupByAttributeValue(value: NonEmptyString): Self = StObject.set(x, "GroupByAttributeValue", value.asInstanceOf[js.Any])
  }
}
