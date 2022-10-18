package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DoubleRange extends StObject {
  
  /**
    * The minimum value in the range.
    */
  var From: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum value in the range.
    */
  var To: js.UndefOr[Double] = js.undefined
}
object DoubleRange {
  
  inline def apply(): DoubleRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleRange]
  }
  
  extension [Self <: DoubleRange](x: Self) {
    
    inline def setFrom(value: Double): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "From", js.undefined)
    
    inline def setTo(value: Double): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
