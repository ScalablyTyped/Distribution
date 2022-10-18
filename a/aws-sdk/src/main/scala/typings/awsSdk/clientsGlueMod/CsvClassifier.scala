package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvClassifier extends StObject {
  
  /**
    * Enables the processing of files that contain only one column.
    */
  var AllowSingleColumn: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Indicates whether the CSV file contains a header.
    */
  var ContainsHeader: js.UndefOr[CsvHeaderOption] = js.undefined
  
  /**
    * The time that this classifier was registered.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A custom symbol to denote what separates each column entry in the row.
    */
  var Delimiter: js.UndefOr[CsvColumnDelimiter] = js.undefined
  
  /**
    * Specifies not to trim values before identifying the type of column values. The default value is true.
    */
  var DisableValueTrimming: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * A list of strings representing column names.
    */
  var Header: js.UndefOr[CsvHeader] = js.undefined
  
  /**
    * The time that this classifier was last updated.
    */
  var LastUpdated: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the classifier.
    */
  var Name: NameString
  
  /**
    * A custom symbol to denote what combines content into a single column value. It must be different from the column delimiter.
    */
  var QuoteSymbol: js.UndefOr[CsvQuoteSymbol] = js.undefined
  
  /**
    * The version of this classifier.
    */
  var Version: js.UndefOr[VersionId] = js.undefined
}
object CsvClassifier {
  
  inline def apply(Name: NameString): CsvClassifier = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CsvClassifier]
  }
  
  extension [Self <: CsvClassifier](x: Self) {
    
    inline def setAllowSingleColumn(value: NullableBoolean): Self = StObject.set(x, "AllowSingleColumn", value.asInstanceOf[js.Any])
    
    inline def setAllowSingleColumnUndefined: Self = StObject.set(x, "AllowSingleColumn", js.undefined)
    
    inline def setContainsHeader(value: CsvHeaderOption): Self = StObject.set(x, "ContainsHeader", value.asInstanceOf[js.Any])
    
    inline def setContainsHeaderUndefined: Self = StObject.set(x, "ContainsHeader", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDelimiter(value: CsvColumnDelimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setDisableValueTrimming(value: NullableBoolean): Self = StObject.set(x, "DisableValueTrimming", value.asInstanceOf[js.Any])
    
    inline def setDisableValueTrimmingUndefined: Self = StObject.set(x, "DisableValueTrimming", js.undefined)
    
    inline def setHeader(value: CsvHeader): Self = StObject.set(x, "Header", value.asInstanceOf[js.Any])
    
    inline def setHeaderUndefined: Self = StObject.set(x, "Header", js.undefined)
    
    inline def setHeaderVarargs(value: NameString*): Self = StObject.set(x, "Header", js.Array(value*))
    
    inline def setLastUpdated(value: js.Date): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setQuoteSymbol(value: CsvQuoteSymbol): Self = StObject.set(x, "QuoteSymbol", value.asInstanceOf[js.Any])
    
    inline def setQuoteSymbolUndefined: Self = StObject.set(x, "QuoteSymbol", js.undefined)
    
    inline def setVersion(value: VersionId): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
