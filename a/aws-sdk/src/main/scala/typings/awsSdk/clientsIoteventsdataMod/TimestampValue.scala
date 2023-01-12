package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimestampValue extends StObject {
  
  /**
    * The value of the timestamp, in the Unix epoch format.
    */
  var timeInMillis: js.UndefOr[EpochMilliTimestamp] = js.undefined
}
object TimestampValue {
  
  inline def apply(): TimestampValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimestampValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimestampValue] (val x: Self) extends AnyVal {
    
    inline def setTimeInMillis(value: EpochMilliTimestamp): Self = StObject.set(x, "timeInMillis", value.asInstanceOf[js.Any])
    
    inline def setTimeInMillisUndefined: Self = StObject.set(x, "timeInMillis", js.undefined)
  }
}
