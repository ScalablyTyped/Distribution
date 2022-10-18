package typings.awsSdk.clientsKinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DiscoverInputSchemaResponse extends StObject {
  
  /**
    * Schema inferred from the streaming source. It identifies the format of the data in the streaming source and how each data element maps to corresponding columns in the in-application stream that you can create.
    */
  var InputSchema: js.UndefOr[SourceSchema] = js.undefined
  
  /**
    * An array of elements, where each element corresponds to a row in a stream record (a stream record can have more than one row).
    */
  var ParsedInputRecords: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.ParsedInputRecords] = js.undefined
  
  /**
    * Stream data that was modified by the processor specified in the InputProcessingConfiguration parameter.
    */
  var ProcessedInputRecords: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.ProcessedInputRecords] = js.undefined
  
  /**
    * Raw stream data that was sampled to infer the schema.
    */
  var RawInputRecords: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsMod.RawInputRecords] = js.undefined
}
object DiscoverInputSchemaResponse {
  
  inline def apply(): DiscoverInputSchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiscoverInputSchemaResponse]
  }
  
  extension [Self <: DiscoverInputSchemaResponse](x: Self) {
    
    inline def setInputSchema(value: SourceSchema): Self = StObject.set(x, "InputSchema", value.asInstanceOf[js.Any])
    
    inline def setInputSchemaUndefined: Self = StObject.set(x, "InputSchema", js.undefined)
    
    inline def setParsedInputRecords(value: ParsedInputRecords): Self = StObject.set(x, "ParsedInputRecords", value.asInstanceOf[js.Any])
    
    inline def setParsedInputRecordsUndefined: Self = StObject.set(x, "ParsedInputRecords", js.undefined)
    
    inline def setParsedInputRecordsVarargs(value: ParsedInputRecord*): Self = StObject.set(x, "ParsedInputRecords", js.Array(value*))
    
    inline def setProcessedInputRecords(value: ProcessedInputRecords): Self = StObject.set(x, "ProcessedInputRecords", value.asInstanceOf[js.Any])
    
    inline def setProcessedInputRecordsUndefined: Self = StObject.set(x, "ProcessedInputRecords", js.undefined)
    
    inline def setProcessedInputRecordsVarargs(value: ProcessedInputRecord*): Self = StObject.set(x, "ProcessedInputRecords", js.Array(value*))
    
    inline def setRawInputRecords(value: RawInputRecords): Self = StObject.set(x, "RawInputRecords", value.asInstanceOf[js.Any])
    
    inline def setRawInputRecordsUndefined: Self = StObject.set(x, "RawInputRecords", js.undefined)
    
    inline def setRawInputRecordsVarargs(value: RawInputRecord*): Self = StObject.set(x, "RawInputRecords", js.Array(value*))
  }
}
