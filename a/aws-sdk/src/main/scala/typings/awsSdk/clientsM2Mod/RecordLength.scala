package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordLength extends StObject {
  
  /**
    * The maximum record length. In case of fixed, both minimum and maximum are the same.
    */
  var max: Integer
  
  /**
    * The minimum record length of a record.
    */
  var min: Integer
}
object RecordLength {
  
  inline def apply(max: Integer, min: Integer): RecordLength = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordLength]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordLength] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Integer): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Integer): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
