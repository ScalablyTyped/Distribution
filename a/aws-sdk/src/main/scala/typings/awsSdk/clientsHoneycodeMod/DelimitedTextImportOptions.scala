package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DelimitedTextImportOptions extends StObject {
  
  /**
    * The encoding of the data in the input file.
    */
  var dataCharacterEncoding: js.UndefOr[ImportDataCharacterEncoding] = js.undefined
  
  /**
    * The delimiter to use for separating columns in a single row of the input.
    */
  var delimiter: DelimitedTextDelimiter
  
  /**
    * Indicates whether the input file has a header row at the top containing the column names.
    */
  var hasHeaderRow: js.UndefOr[HasHeaderRow] = js.undefined
  
  /**
    * A parameter to indicate whether empty rows should be ignored or be included in the import.
    */
  var ignoreEmptyRows: js.UndefOr[IgnoreEmptyRows] = js.undefined
}
object DelimitedTextImportOptions {
  
  inline def apply(delimiter: DelimitedTextDelimiter): DelimitedTextImportOptions = {
    val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelimitedTextImportOptions]
  }
  
  extension [Self <: DelimitedTextImportOptions](x: Self) {
    
    inline def setDataCharacterEncoding(value: ImportDataCharacterEncoding): Self = StObject.set(x, "dataCharacterEncoding", value.asInstanceOf[js.Any])
    
    inline def setDataCharacterEncodingUndefined: Self = StObject.set(x, "dataCharacterEncoding", js.undefined)
    
    inline def setDelimiter(value: DelimitedTextDelimiter): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
    
    inline def setHasHeaderRow(value: HasHeaderRow): Self = StObject.set(x, "hasHeaderRow", value.asInstanceOf[js.Any])
    
    inline def setHasHeaderRowUndefined: Self = StObject.set(x, "hasHeaderRow", js.undefined)
    
    inline def setIgnoreEmptyRows(value: IgnoreEmptyRows): Self = StObject.set(x, "ignoreEmptyRows", value.asInstanceOf[js.Any])
    
    inline def setIgnoreEmptyRowsUndefined: Self = StObject.set(x, "ignoreEmptyRows", js.undefined)
  }
}
