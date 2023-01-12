package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvOutputOptions extends StObject {
  
  /**
    * A single character that specifies the delimiter used to create CSV job output.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.clientsDatabrewMod.Delimiter] = js.undefined
}
object CsvOutputOptions {
  
  inline def apply(): CsvOutputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvOutputOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CsvOutputOptions] (val x: Self) extends AnyVal {
    
    inline def setDelimiter(value: Delimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
  }
}
