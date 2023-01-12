package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the result of one element in the data pilot data array.
  * @see com.sun.star.sheet.XDataPilotResults
  */
trait DataResult extends StObject {
  
  /**
    * contains boolean flags describing the result.
    * @see com.sun.star.sheet.DataResultFlags
    */
  var Flags: Double
  
  /** contains the result value. */
  var Value: Double
}
object DataResult {
  
  inline def apply(Flags: Double, Value: Double): DataResult = {
    val __obj = js.Dynamic.literal(Flags = Flags.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataResult] (val x: Self) extends AnyVal {
    
    inline def setFlags(value: Double): Self = StObject.set(x, "Flags", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
