package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchArrayProperties extends StObject {
  
  /**
    * The size of the array, if this is an array batch job. Valid values are integers between 2 and 10,000.
    */
  var Size: js.UndefOr[Integer] = js.undefined
}
object BatchArrayProperties {
  
  inline def apply(): BatchArrayProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchArrayProperties]
  }
  
  extension [Self <: BatchArrayProperties](x: Self) {
    
    inline def setSize(value: Integer): Self = StObject.set(x, "Size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "Size", js.undefined)
  }
}
