package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSerialization extends StObject {
  
  /**
    * Describes the serialization of a CSV-encoded object.
    */
  var csv: js.UndefOr[CSVInput] = js.undefined
}
object InputSerialization {
  
  inline def apply(): InputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSerialization]
  }
  
  extension [Self <: InputSerialization](x: Self) {
    
    inline def setCsv(value: CSVInput): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
  }
}
