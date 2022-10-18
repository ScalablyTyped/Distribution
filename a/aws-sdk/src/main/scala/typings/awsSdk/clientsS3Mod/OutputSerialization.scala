package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputSerialization extends StObject {
  
  /**
    * Describes the serialization of CSV-encoded Select results.
    */
  var CSV: js.UndefOr[CSVOutput] = js.undefined
  
  /**
    * Specifies JSON as request's output serialization format.
    */
  var JSON: js.UndefOr[JSONOutput] = js.undefined
}
object OutputSerialization {
  
  inline def apply(): OutputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputSerialization]
  }
  
  extension [Self <: OutputSerialization](x: Self) {
    
    inline def setCSV(value: CSVOutput): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
    
    inline def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
    
    inline def setJSON(value: JSONOutput): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
    
    inline def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
  }
}
