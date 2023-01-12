package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CsvFormatDescriptor extends StObject {
  
  /**
    * The character set in which the source CSV file is written.
    */
  var Charset: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.Charset] = js.undefined
  
  /**
    * Whether or not the source CSV file contains a header.
    */
  var ContainsHeader: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The character used to delimit the source CSV file.
    */
  var Delimiter: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.Delimiter] = js.undefined
  
  /**
    * The level of compression of the source CSV file.
    */
  var FileCompression: js.UndefOr[CSVFileCompression] = js.undefined
  
  /**
    * A list of the source CSV file's headers, if any.
    */
  var HeaderList: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.HeaderList] = js.undefined
  
  /**
    * The character used as a quote character.
    */
  var QuoteSymbol: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.QuoteSymbol] = js.undefined
}
object CsvFormatDescriptor {
  
  inline def apply(): CsvFormatDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CsvFormatDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CsvFormatDescriptor] (val x: Self) extends AnyVal {
    
    inline def setCharset(value: Charset): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "Charset", js.undefined)
    
    inline def setContainsHeader(value: Boolean): Self = StObject.set(x, "ContainsHeader", value.asInstanceOf[js.Any])
    
    inline def setContainsHeaderUndefined: Self = StObject.set(x, "ContainsHeader", js.undefined)
    
    inline def setDelimiter(value: Delimiter): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setFileCompression(value: CSVFileCompression): Self = StObject.set(x, "FileCompression", value.asInstanceOf[js.Any])
    
    inline def setFileCompressionUndefined: Self = StObject.set(x, "FileCompression", js.undefined)
    
    inline def setHeaderList(value: HeaderList): Self = StObject.set(x, "HeaderList", value.asInstanceOf[js.Any])
    
    inline def setHeaderListUndefined: Self = StObject.set(x, "HeaderList", js.undefined)
    
    inline def setHeaderListVarargs(value: ColumnName*): Self = StObject.set(x, "HeaderList", js.Array(value*))
    
    inline def setQuoteSymbol(value: QuoteSymbol): Self = StObject.set(x, "QuoteSymbol", value.asInstanceOf[js.Any])
    
    inline def setQuoteSymbolUndefined: Self = StObject.set(x, "QuoteSymbol", js.undefined)
  }
}
