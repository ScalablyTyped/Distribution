package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecordFormat extends StObject {
  
  /**
    * When you configure application input at the time of creating or updating an application, provides additional mapping information specific to the record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
    */
  var MappingParameters: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.MappingParameters] = js.undefined
  
  /**
    * The type of record format.
    */
  var RecordFormatType: typings.awsSdk.clientsKinesisanalyticsv2Mod.RecordFormatType
}
object RecordFormat {
  
  inline def apply(RecordFormatType: RecordFormatType): RecordFormat = {
    val __obj = js.Dynamic.literal(RecordFormatType = RecordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecordFormat] (val x: Self) extends AnyVal {
    
    inline def setMappingParameters(value: MappingParameters): Self = StObject.set(x, "MappingParameters", value.asInstanceOf[js.Any])
    
    inline def setMappingParametersUndefined: Self = StObject.set(x, "MappingParameters", js.undefined)
    
    inline def setRecordFormatType(value: RecordFormatType): Self = StObject.set(x, "RecordFormatType", value.asInstanceOf[js.Any])
  }
}
