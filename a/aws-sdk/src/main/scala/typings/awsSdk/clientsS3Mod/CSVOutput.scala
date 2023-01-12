package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSVOutput extends StObject {
  
  /**
    * The value used to separate individual fields in a record. You can specify an arbitrary delimiter.
    */
  var FieldDelimiter: js.UndefOr[typings.awsSdk.clientsS3Mod.FieldDelimiter] = js.undefined
  
  /**
    * A single character used for escaping when the field delimiter is part of the value. For example, if the value is a, b, Amazon S3 wraps this field value in quotation marks, as follows: " a , b ".
    */
  var QuoteCharacter: js.UndefOr[typings.awsSdk.clientsS3Mod.QuoteCharacter] = js.undefined
  
  /**
    * The single character used for escaping the quote character inside an already escaped value.
    */
  var QuoteEscapeCharacter: js.UndefOr[typings.awsSdk.clientsS3Mod.QuoteEscapeCharacter] = js.undefined
  
  /**
    * Indicates whether to use quotation marks around output fields.     ALWAYS: Always use quotation marks for output fields.    ASNEEDED: Use quotation marks for output fields when needed.  
    */
  var QuoteFields: js.UndefOr[typings.awsSdk.clientsS3Mod.QuoteFields] = js.undefined
  
  /**
    * A single character used to separate individual records in the output. Instead of the default value, you can specify an arbitrary delimiter.
    */
  var RecordDelimiter: js.UndefOr[typings.awsSdk.clientsS3Mod.RecordDelimiter] = js.undefined
}
object CSVOutput {
  
  inline def apply(): CSVOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CSVOutput] (val x: Self) extends AnyVal {
    
    inline def setFieldDelimiter(value: FieldDelimiter): Self = StObject.set(x, "FieldDelimiter", value.asInstanceOf[js.Any])
    
    inline def setFieldDelimiterUndefined: Self = StObject.set(x, "FieldDelimiter", js.undefined)
    
    inline def setQuoteCharacter(value: QuoteCharacter): Self = StObject.set(x, "QuoteCharacter", value.asInstanceOf[js.Any])
    
    inline def setQuoteCharacterUndefined: Self = StObject.set(x, "QuoteCharacter", js.undefined)
    
    inline def setQuoteEscapeCharacter(value: QuoteEscapeCharacter): Self = StObject.set(x, "QuoteEscapeCharacter", value.asInstanceOf[js.Any])
    
    inline def setQuoteEscapeCharacterUndefined: Self = StObject.set(x, "QuoteEscapeCharacter", js.undefined)
    
    inline def setQuoteFields(value: QuoteFields): Self = StObject.set(x, "QuoteFields", value.asInstanceOf[js.Any])
    
    inline def setQuoteFieldsUndefined: Self = StObject.set(x, "QuoteFields", js.undefined)
    
    inline def setRecordDelimiter(value: RecordDelimiter): Self = StObject.set(x, "RecordDelimiter", value.asInstanceOf[js.Any])
    
    inline def setRecordDelimiterUndefined: Self = StObject.set(x, "RecordDelimiter", js.undefined)
  }
}
