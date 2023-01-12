package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectedCsvFormatDescriptor extends StObject {
  
  /**
    * The format's charset.
    */
  var Charset: js.UndefOr[DetectedField] = js.undefined
  
  /**
    * Whether the format includes a header.
    */
  var ContainsHeader: js.UndefOr[DetectedField] = js.undefined
  
  /**
    * The format's delimiter.
    */
  var Delimiter: js.UndefOr[DetectedField] = js.undefined
  
  /**
    * The format's file compression.
    */
  var FileCompression: js.UndefOr[DetectedField] = js.undefined
  
  /**
    * The format's header list.
    */
  var HeaderList: js.UndefOr[DetectedField] = js.undefined
  
  /**
    * The format's quote symbol.
    */
  var QuoteSymbol: js.UndefOr[DetectedField] = js.undefined
}
object DetectedCsvFormatDescriptor {
  
  inline def apply(): DetectedCsvFormatDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectedCsvFormatDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectedCsvFormatDescriptor] (val x: Self) extends AnyVal {
    
    inline def setCharset(value: DetectedField): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "Charset", js.undefined)
    
    inline def setContainsHeader(value: DetectedField): Self = StObject.set(x, "ContainsHeader", value.asInstanceOf[js.Any])
    
    inline def setContainsHeaderUndefined: Self = StObject.set(x, "ContainsHeader", js.undefined)
    
    inline def setDelimiter(value: DetectedField): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setFileCompression(value: DetectedField): Self = StObject.set(x, "FileCompression", value.asInstanceOf[js.Any])
    
    inline def setFileCompressionUndefined: Self = StObject.set(x, "FileCompression", js.undefined)
    
    inline def setHeaderList(value: DetectedField): Self = StObject.set(x, "HeaderList", value.asInstanceOf[js.Any])
    
    inline def setHeaderListUndefined: Self = StObject.set(x, "HeaderList", js.undefined)
    
    inline def setQuoteSymbol(value: DetectedField): Self = StObject.set(x, "QuoteSymbol", value.asInstanceOf[js.Any])
    
    inline def setQuoteSymbolUndefined: Self = StObject.set(x, "QuoteSymbol", js.undefined)
  }
}
