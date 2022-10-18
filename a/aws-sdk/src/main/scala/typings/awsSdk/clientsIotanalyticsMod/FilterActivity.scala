package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterActivity extends StObject {
  
  /**
    * An expression that looks like a SQL WHERE clause that must return a Boolean value. Messages that satisfy the condition are passed to the next activity. 
    */
  var filter: FilterExpression
  
  /**
    * The name of the filter activity.
    */
  var name: ActivityName
  
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
}
object FilterActivity {
  
  inline def apply(filter: FilterExpression, name: ActivityName): FilterActivity = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterActivity]
  }
  
  extension [Self <: FilterActivity](x: Self) {
    
    inline def setFilter(value: FilterExpression): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setName(value: ActivityName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNext(value: ActivityName): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setNextUndefined: Self = StObject.set(x, "next", js.undefined)
  }
}
