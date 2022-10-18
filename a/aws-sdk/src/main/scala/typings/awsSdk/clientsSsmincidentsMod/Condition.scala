package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition extends StObject {
  
  /**
    * After the specified timestamp.
    */
  var after: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Before the specified timestamp
    */
  var before: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The value is equal to the provided string or integer. 
    */
  @JSName("equals")
  var equals_FCondition: js.UndefOr[AttributeValueList] = js.undefined
}
object Condition {
  
  inline def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  
  extension [Self <: Condition](x: Self) {
    
    inline def setAfter(value: js.Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
    
    inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
    
    inline def setBefore(value: js.Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    inline def setEquals_(value: AttributeValueList): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
  }
}
