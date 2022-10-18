package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestinationSchema extends StObject {
  
  /**
    * Specifies the format of the records on the output stream.
    */
  var RecordFormatType: typings.awsSdk.clientsKinesisanalyticsv2Mod.RecordFormatType
}
object DestinationSchema {
  
  inline def apply(RecordFormatType: RecordFormatType): DestinationSchema = {
    val __obj = js.Dynamic.literal(RecordFormatType = RecordFormatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestinationSchema]
  }
  
  extension [Self <: DestinationSchema](x: Self) {
    
    inline def setRecordFormatType(value: RecordFormatType): Self = StObject.set(x, "RecordFormatType", value.asInstanceOf[js.Any])
  }
}
