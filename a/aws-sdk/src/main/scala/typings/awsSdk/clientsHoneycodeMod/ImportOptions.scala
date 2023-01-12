package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportOptions extends StObject {
  
  /**
    * Options relating to parsing delimited text. Required if dataFormat is DELIMITED_TEXT.
    */
  var delimitedTextOptions: js.UndefOr[DelimitedTextImportOptions] = js.undefined
  
  /**
    * Options relating to the destination of the import request.
    */
  var destinationOptions: js.UndefOr[DestinationOptions] = js.undefined
}
object ImportOptions {
  
  inline def apply(): ImportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportOptions] (val x: Self) extends AnyVal {
    
    inline def setDelimitedTextOptions(value: DelimitedTextImportOptions): Self = StObject.set(x, "delimitedTextOptions", value.asInstanceOf[js.Any])
    
    inline def setDelimitedTextOptionsUndefined: Self = StObject.set(x, "delimitedTextOptions", js.undefined)
    
    inline def setDestinationOptions(value: DestinationOptions): Self = StObject.set(x, "destinationOptions", value.asInstanceOf[js.Any])
    
    inline def setDestinationOptionsUndefined: Self = StObject.set(x, "destinationOptions", js.undefined)
  }
}
