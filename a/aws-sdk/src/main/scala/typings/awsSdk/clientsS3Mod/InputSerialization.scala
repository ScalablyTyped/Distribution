package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSerialization extends StObject {
  
  /**
    * Describes the serialization of a CSV-encoded object.
    */
  var CSV: js.UndefOr[CSVInput] = js.undefined
  
  /**
    * Specifies object's compression format. Valid values: NONE, GZIP, BZIP2. Default Value: NONE.
    */
  var CompressionType: js.UndefOr[typings.awsSdk.clientsS3Mod.CompressionType] = js.undefined
  
  /**
    * Specifies JSON as object's input serialization format.
    */
  var JSON: js.UndefOr[JSONInput] = js.undefined
  
  /**
    * Specifies Parquet as object's input serialization format.
    */
  var Parquet: js.UndefOr[ParquetInput] = js.undefined
}
object InputSerialization {
  
  inline def apply(): InputSerialization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSerialization]
  }
  
  extension [Self <: InputSerialization](x: Self) {
    
    inline def setCSV(value: CSVInput): Self = StObject.set(x, "CSV", value.asInstanceOf[js.Any])
    
    inline def setCSVUndefined: Self = StObject.set(x, "CSV", js.undefined)
    
    inline def setCompressionType(value: CompressionType): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
    
    inline def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
    
    inline def setJSON(value: JSONInput): Self = StObject.set(x, "JSON", value.asInstanceOf[js.Any])
    
    inline def setJSONUndefined: Self = StObject.set(x, "JSON", js.undefined)
    
    inline def setParquet(value: ParquetInput): Self = StObject.set(x, "Parquet", value.asInstanceOf[js.Any])
    
    inline def setParquetUndefined: Self = StObject.set(x, "Parquet", js.undefined)
  }
}
