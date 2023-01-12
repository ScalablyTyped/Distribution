package typings.awsSdk.clientsRumMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeRange extends StObject {
  
  /**
    * The beginning of the time range to retrieve performance events from.
    */
  var After: QueryTimestamp
  
  /**
    * The end of the time range to retrieve performance events from. If you omit this, the time range extends to the time that this operation is performed.
    */
  var Before: js.UndefOr[QueryTimestamp] = js.undefined
}
object TimeRange {
  
  inline def apply(After: QueryTimestamp): TimeRange = {
    val __obj = js.Dynamic.literal(After = After.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeRange] (val x: Self) extends AnyVal {
    
    inline def setAfter(value: QueryTimestamp): Self = StObject.set(x, "After", value.asInstanceOf[js.Any])
    
    inline def setBefore(value: QueryTimestamp): Self = StObject.set(x, "Before", value.asInstanceOf[js.Any])
    
    inline def setBeforeUndefined: Self = StObject.set(x, "Before", js.undefined)
  }
}
