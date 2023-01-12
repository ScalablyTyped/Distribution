package typings.awsSdk.clientsGlacierMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputSerialization extends StObject {
  
  /**
    * Describes the serialization of CSV-encoded query results.
    */
  var csv: js.UndefOr[CSVOutput] = js.undefined
}
object OutputSerialization {
  
  inline def apply(): OutputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSerialization]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputSerialization] (val x: Self) extends AnyVal {
    
    inline def setCsv(value: CSVOutput): Self = StObject.set(x, "csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "csv", js.undefined)
  }
}
