package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Record extends StObject {
  
  /**
    * The path, as a JSONPath expression, to the sensitive data. For an Avro object container or Parquet file, this is the path to the field in the record (recordIndex) that contains the data. For a JSON or JSON Lines file, this is the path to the field or array that contains the data. If the data is a value in an array, the path also indicates which value contains the data. If Amazon Macie detects sensitive data in the name of any element in the path, Macie omits this field. If the name of an element exceeds 20 characters, Macie truncates the name by removing characters from the beginning of the name. If the resulting full path exceeds 250 characters, Macie also truncates the path, starting with the first element in the path, until the path contains 250 or fewer characters.
    */
  var jsonPath: js.UndefOr[string] = js.undefined
  
  /**
    * For an Avro object container or Parquet file, the record index, starting from 0, for the record that contains the sensitive data. For a JSON Lines file, the line index, starting from 0, for the line that contains the sensitive data. This value is always 0 for JSON files.
    */
  var recordIndex: js.UndefOr[long] = js.undefined
}
object Record {
  
  inline def apply(): Record = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Record]
  }
  
  extension [Self <: Record](x: Self) {
    
    inline def setJsonPath(value: string): Self = StObject.set(x, "jsonPath", value.asInstanceOf[js.Any])
    
    inline def setJsonPathUndefined: Self = StObject.set(x, "jsonPath", js.undefined)
    
    inline def setRecordIndex(value: long): Self = StObject.set(x, "recordIndex", value.asInstanceOf[js.Any])
    
    inline def setRecordIndexUndefined: Self = StObject.set(x, "recordIndex", js.undefined)
  }
}
