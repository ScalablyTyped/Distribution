package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSchemaUpdate extends StObject {
  
  /**
    * A list of RecordColumn objects. Each object describes the mapping of the streaming source element to the corresponding column in the in-application stream. 
    */
  var RecordColumnUpdates: js.UndefOr[RecordColumns] = js.undefined
  
  /**
    * Specifies the encoding of the records in the streaming source. For example, UTF-8.
    */
  var RecordEncodingUpdate: js.UndefOr[RecordEncoding] = js.undefined
  
  /**
    * Specifies the format of the records on the streaming source.
    */
  var RecordFormatUpdate: js.UndefOr[RecordFormat] = js.undefined
}
object InputSchemaUpdate {
  
  inline def apply(): InputSchemaUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSchemaUpdate]
  }
  
  extension [Self <: InputSchemaUpdate](x: Self) {
    
    inline def setRecordColumnUpdates(value: RecordColumns): Self = StObject.set(x, "RecordColumnUpdates", value.asInstanceOf[js.Any])
    
    inline def setRecordColumnUpdatesUndefined: Self = StObject.set(x, "RecordColumnUpdates", js.undefined)
    
    inline def setRecordColumnUpdatesVarargs(value: RecordColumn*): Self = StObject.set(x, "RecordColumnUpdates", js.Array(value*))
    
    inline def setRecordEncodingUpdate(value: RecordEncoding): Self = StObject.set(x, "RecordEncodingUpdate", value.asInstanceOf[js.Any])
    
    inline def setRecordEncodingUpdateUndefined: Self = StObject.set(x, "RecordEncodingUpdate", js.undefined)
    
    inline def setRecordFormatUpdate(value: RecordFormat): Self = StObject.set(x, "RecordFormatUpdate", value.asInstanceOf[js.Any])
    
    inline def setRecordFormatUpdateUndefined: Self = StObject.set(x, "RecordFormatUpdate", js.undefined)
  }
}
