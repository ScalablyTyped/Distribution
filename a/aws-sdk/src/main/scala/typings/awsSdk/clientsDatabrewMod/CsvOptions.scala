package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvOptions extends StObject {
  
  /**
    * A single character that specifies the delimiter being used in the CSV file.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.clientsDatabrewMod.Delimiter] = js.undefined
  
  /**
    * A variable that specifies whether the first row in the file is parsed as the header. If this value is false, column names are auto-generated.
    */
  var HeaderRow: js.UndefOr[typings.awsSdk.clientsDatabrewMod.HeaderRow] = js.undefined
}
object CsvOptions {
  
  inline def apply(): CsvOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvOptions]
  }
  
  extension [Self <: CsvOptions](x: Self) {
    
    inline def setDelimiter(value: Delimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setHeaderRow(value: HeaderRow): Self = StObject.set(x, "HeaderRow", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowUndefined: Self = StObject.set(x, "HeaderRow", js.undefined)
  }
}
