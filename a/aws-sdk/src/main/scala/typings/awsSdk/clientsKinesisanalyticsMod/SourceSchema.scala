package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceSchema extends StObject {
  
  /**
    * A list of RecordColumn objects.
    */
  var RecordColumns: typings.awsSdk.clientsKinesisanalyticsMod.RecordColumns
  
  /**
    * Specifies the encoding of the records in the streaming source. For example, UTF-8.
    */
  var RecordEncoding: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.RecordEncoding] = js.undefined
  
  /**
    * Specifies the format of the records on the streaming source.
    */
  var RecordFormat: typings.awsSdk.clientsKinesisanalyticsMod.RecordFormat
}
object SourceSchema {
  
  inline def apply(RecordColumns: RecordColumns, RecordFormat: RecordFormat): SourceSchema = {
    val __obj = js.Dynamic.literal(RecordColumns = RecordColumns.asInstanceOf[js.Any], RecordFormat = RecordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceSchema] (val x: Self) extends AnyVal {
    
    inline def setRecordColumns(value: RecordColumns): Self = StObject.set(x, "RecordColumns", value.asInstanceOf[js.Any])
    
    inline def setRecordColumnsVarargs(value: RecordColumn*): Self = StObject.set(x, "RecordColumns", js.Array(value*))
    
    inline def setRecordEncoding(value: RecordEncoding): Self = StObject.set(x, "RecordEncoding", value.asInstanceOf[js.Any])
    
    inline def setRecordEncodingUndefined: Self = StObject.set(x, "RecordEncoding", js.undefined)
    
    inline def setRecordFormat(value: RecordFormat): Self = StObject.set(x, "RecordFormat", value.asInstanceOf[js.Any])
  }
}
