package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputFormatOptions extends StObject {
  
  /**
    * Represents a set of options that define the structure of comma-separated value (CSV) job output.
    */
  var Csv: js.UndefOr[CsvOutputOptions] = js.undefined
}
object OutputFormatOptions {
  
  inline def apply(): OutputFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputFormatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OutputFormatOptions] (val x: Self) extends AnyVal {
    
    inline def setCsv(value: CsvOutputOptions): Self = StObject.set(x, "Csv", value.asInstanceOf[js.Any])
    
    inline def setCsvUndefined: Self = StObject.set(x, "Csv", js.undefined)
  }
}
