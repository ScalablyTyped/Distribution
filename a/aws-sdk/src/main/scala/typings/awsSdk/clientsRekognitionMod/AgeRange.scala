package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgeRange extends StObject {
  
  /**
    * The highest estimated age.
    */
  var High: js.UndefOr[UInteger] = js.undefined
  
  /**
    * The lowest estimated age.
    */
  var Low: js.UndefOr[UInteger] = js.undefined
}
object AgeRange {
  
  inline def apply(): AgeRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgeRange]
  }
  
  extension [Self <: AgeRange](x: Self) {
    
    inline def setHigh(value: UInteger): Self = StObject.set(x, "High", value.asInstanceOf[js.Any])
    
    inline def setHighUndefined: Self = StObject.set(x, "High", js.undefined)
    
    inline def setLow(value: UInteger): Self = StObject.set(x, "Low", value.asInstanceOf[js.Any])
    
    inline def setLowUndefined: Self = StObject.set(x, "Low", js.undefined)
  }
}
